package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomepageLocators {

//------Ama-01-Shoes
	//Search Text Box
	@FindBy (xpath="//input[@aria-label='Search']")
	public WebElement txtbxSearch;
	//Search Button
	@FindBy (xpath="//input[@type='submit']")
	public WebElement btnSearch;

//------Ama-04-Mousehover	
	//Prime Link
	@FindBy (xpath="//a[@id='nav-link-amazonprime']") 		
	public WebElement linkPrime;	
	//Prime Try Link
	@FindBy (xpath="//a[contains(text(),'Try Prime')]")
	public WebElement linkTryPrime;
	


//Homepage Display-------//
	@FindBy (xpath="//div[@id='pageContent']")
	public WebElement displayHomepage;	

//------Ama-08-LogoClickable
	//Search for Laptop
	@FindBy (xpath="(//span[contains(text(),'Laptop')])[1]")
	public WebElement txtLaptop;
	//Amazon Logo Homepage Appear
	@FindBy (xpath="//div[@id='pageContent']")
	public WebElement homepageAppear;	

//------Ama-10-Career
	//Click on Career
	@FindBy (xpath="//a[contains(text(),'Careers')]")
	public WebElement btnCareer;
	
	
//	@FindBy (xpath="")
//	public WebElement abc;
	
	
	
	
	
	//input[@aria-label='Search']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
