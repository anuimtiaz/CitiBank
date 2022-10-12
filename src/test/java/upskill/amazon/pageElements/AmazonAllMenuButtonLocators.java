package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonAllMenuButtonLocators {
	
	//Open All Menu
	@FindBy (xpath="//a[@id='nav-hamburger-menu']")
	public WebElement btnClickMenu;
	
	//Select Amazon Fresh
	@FindBy (xpath="//div[contains(text(),'Amazon Fresh')]")
	public WebElement linkAmazonFresh;
	
	//Select All Amazon Fresh
	@FindBy (xpath="//a[contains(text(),'All Amazon Fresh')]")
	public WebElement linkAllFresh;
	
	//Amazon Fresh Products
	@FindBy (xpath="//a[@aria-label='Amazon Fresh Logo']")
	public WebElement btnClickFresh;
	
	
}
