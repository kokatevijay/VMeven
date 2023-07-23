package NaukariPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(/html/body/main/div/div/div/div/div/div/div/div/div/a)[1]") private WebElement ClickOnViewProfile;
	@FindBy(xpath="//span[@name='Email']") private WebElement GetUserName;
	@FindBy(xpath="//div[@class='nI-gNb-drawer__icon']") private WebElement profile;
	@FindBy(xpath="(//a[@class='nI-gNb-list-cta'])[4]") private WebElement Logout;
	
	@FindBy(xpath="//em[text()='editOneTheme']") private WebElement EditeProfile;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonviewbutton() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnViewProfile.click();
	}
	public String getActualUserName() throws InterruptedException
	{
		Thread.sleep(3000);
		String ActualUserName = GetUserName.getText();
		return ActualUserName;
	}
    public void ClicOnProfile() throws InterruptedException
    {
    	Thread.sleep(500);
    	profile.click();
    }
    public void ClicOnLogout() throws InterruptedException
    {
    	Thread.sleep(500);
    	Logout.click();
    }
    public void ClickOnEditeProfile() throws InterruptedException
    {
    	Thread.sleep(2000);
    	EditeProfile.click();
    }
}
