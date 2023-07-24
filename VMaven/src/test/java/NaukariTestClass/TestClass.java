package NaukariTestClass;

import org.testng.annotations.Test;

import NaukariBaseClass.BaseClass;
import NaukariPOMClasses.HomePage;
import NaukariPOMClasses.LoginPage;
import NaukariUtility.UtilityClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass extends BaseClass
{
	UtilityClass uti= new UtilityClass();
	LoginPage Login;
	HomePage Home;
	@Parameters("BrowserName")
	@BeforeClass
	  public void LaunchBrowser(@Optional String name) throws InterruptedException, IOException 
	  {
	  /*  if (name.equals("firefox"))
	    {
		   FirefoxBrowser();	
		}
	    else if(name.equals("chrome"))
	    {
	    	ChromeBrowser();
	    }*/
		FirefoxBrowser();
		Login = new LoginPage(driver);
		Home = new HomePage(driver);
	  }
	@BeforeMethod
	  public void LoginApplication() throws IOException, InterruptedException 
	{
		Login.ClickOnLoginButton();
		Login.SendUserName(uti.getDatafromPropertyFile("UID"));
		Login.SendPassword(uti.getDatafromPropertyFile("PWD"));
		Login.ClickForLogin();
		
		Reporter.log("Login application Successfully...",true);
		
		Home.clickonviewbutton();
	 }
  @Test
  public void ValidateUserName() throws IOException, InterruptedException 
  {
	 String ActualUID = Home.getActualUserName();
	 String ExpUID = uti.getDatafromPropertyFile("UID");
	 
	 Assert.assertEquals(ActualUID,ExpUID," TC Passed, Actual and Expected UserName are matched");
	 Reporter.log("Firefox Browser Launch Successfully...",true);
  }
  @AfterMethod
  public void LogoutApplication() throws InterruptedException
  {
	  Home.ClicOnProfile();
	 // Home.ClicOnLogout();
  }
  @AfterClass
  public void CloseBrowser()
  {
	  //driver.close();
  }
}