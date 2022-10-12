package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHelpLocators {

	//Click on Help
	@FindBy (xpath="//a[contains(text(),'Help')]")
	public WebElement btnHelp;
	
	//Click Track Your Package
	@FindBy (xpath="(//div[contains(text(),'Track your package')])[1]")
	public WebElement btnTrackPage;	

	//Play Video
	//@FindBy (xpath="//div[@class='vidContainer']")
	@FindBy (xpath="//div[@class='playBox']")
	public WebElement btnPlay;
	
	//Close Video
	//@FindBy (xpath="//a[@onclick='cVid()']")
	@FindBy (xpath="//a[@id='close-btn']")
	public WebElement btnCloseVideo;	
	
	//Help & Customer Page
	@FindBy (xpath="(//div[@class='inner'])[1]")
	public WebElement helpHomepage;
	//a[contains(text(),'Help & Customer Service')]
	
	
}
