package NaukariPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="login_Layer") private WebElement Click;
	@FindBy(xpath="(//input[@class=''])[1]") private WebElement UserName;
	@FindBy(xpath="(//input[@class=''])[2]") private WebElement Password;
	@FindBy(xpath="//button[text()='Login']") private WebElement ClickOnLogin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOnLoginButton() throws InterruptedException
	{
		Thread.sleep(2000);
		Click.click();
	}
	public void SendUserName(String UI) throws InterruptedException
	{
		Thread.sleep(500);
		UserName.sendKeys(UI);
	}
	public void SendPassword(String PW) throws InterruptedException
	{
		Thread.sleep(500);
		Password.sendKeys(PW);
	}
	public void ClickForLogin() throws InterruptedException
	{
		Thread.sleep(500);
		ClickOnLogin.click();
	}
}