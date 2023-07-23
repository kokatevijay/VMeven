package NaukariTestClass;

import org.testng.annotations.Test;

import NaukariBaseClass.BaseClass;
import NaukariPOMClasses.BasicDetailsPage;
import NaukariPOMClasses.HomePage;
import NaukariPOMClasses.LoginPage;
import NaukariUtility.UtilityClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass1 extends BaseClass
{
	UtilityClass uti= new UtilityClass();
	LoginPage Login;
	HomePage Home;
	BasicDetailsPage Basic;
	 @BeforeClass
	  public void LaunchBrowser() throws InterruptedException, IOException 
	  {
		 FirefoxBrowser();
		 Login = new LoginPage(driver);
		 Home = new HomePage(driver);
		 Basic = new BasicDetailsPage(driver);
		 Reporter.log("Launch Browser",true);
	  }
	 @BeforeMethod
	  public void LoginApplication() throws InterruptedException, IOException 
	  {
		 Login.ClickOnLoginButton();
		 Login.SendUserName(uti.getDatafromPropertyFile("UID"));
		 Login.SendPassword(uti.getDatafromPropertyFile("PWD"));
		 Login.ClickForLogin();
		 
		 Home.clickonviewbutton();
		 Home.ClickOnEditeProfile();
		 Reporter.log("Login application",true);
	  }
     @Test
     public void Verification() throws InterruptedException 
     {
    	   boolean Resuls = Basic.ChecktabisSelect();
    	   Assert.assertTrue(Resuls,"Result is true");
    	   Reporter.log("Verification is done",true);
    	 
     }
     @AfterMethod
     public void LogoutApplication() 
     {
     }
    @AfterClass
    public void CloseBrowser() 
    {
    }
}