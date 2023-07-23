package NaukariPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicDetailsPage 
{
	@FindBy(xpath="(//p[@class='col s3 mt0'])[1]")private WebElement India;
	
	public BasicDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public boolean ChecktabisSelect() throws InterruptedException
	{
		Thread.sleep(2000);
	    boolean Output = India.isSelected();
		return Output;
	}
}
