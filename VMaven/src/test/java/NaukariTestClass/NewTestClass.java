package NaukariTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestClass
{
   public void oppenanappliacation()
   
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver= new ChromeDriver();
	   
	   driver.get("https://github.com/");
   }
}
