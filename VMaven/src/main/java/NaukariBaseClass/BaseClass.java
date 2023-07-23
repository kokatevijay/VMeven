package NaukariBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import NaukariUtility.UtilityClass;

public class BaseClass
{
	UtilityClass uti= new UtilityClass();
	protected WebDriver driver;

	public void FirefoxBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdiver.gecko.driver","D:\\selenium-java-4.1.4\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(uti.getDatafromPropertyFile("URL"));
		//driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//Reporter.log("Firefox Browser Launch Successfully...",true);
		Thread.sleep(2000);
	}
	public void ChromeBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdiver.chrome.driver","D:\\selenium-java-4.1.4\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(uti.getDatafromPropertyFile("URL"));
		driver.manage().window().maximize();
	//	Reporter.log("Chrome Browser Launch Successfully...",true);
		Thread.sleep(2000);
	}

}