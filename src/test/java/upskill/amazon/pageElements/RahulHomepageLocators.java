package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulHomepageLocators {

	
	//iframe locator
	@FindBy(xpath="//iframe[@name='iframe-name']")
	public WebElement iframeHome;
	
	
	//Home button
	@FindBy (xpath="//*[contains(text(),'Home')]")
	public WebElement btnHome;
	
	
}
