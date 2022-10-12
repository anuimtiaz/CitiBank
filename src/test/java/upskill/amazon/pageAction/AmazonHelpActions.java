package upskill.amazon.pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonHelpLocators;
import upskill.utilities.SetupDrivers;

public class AmazonHelpActions {
	AmazonHelpLocators AmazonHelpLocatorsObj;
	
	public AmazonHelpActions () {
		AmazonHelpLocatorsObj = new AmazonHelpLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHelpLocatorsObj);
	}
//------Ama-09-Help
	public void clickHelp() throws Exception {
		AmazonHelpLocatorsObj.btnHelp.click();
		Thread.sleep(2000);
	}
//------Ama-09-Help
	public void trackYourPackage() throws Exception{
		AmazonHelpLocatorsObj.btnTrackPage.click();
		Thread.sleep(2000);
	}	
	public void switchNewWindow() throws Exception {
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);	
		Thread.sleep(2000);
	}		
	}
	public void playVideo() throws Exception{
		AmazonHelpLocatorsObj.btnPlay.click();
		Thread.sleep(2000);
	}
	public void closeVideo() throws Exception {
//		AmazonHelpLocatorsObj.btnCloseVideo.click();
//		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
//			SetupDrivers.driver.switchTo().window(winhandle);	
//		}
//		SetupDrivers.driver.switchTo().frame("vidContainer");
		JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.driver;
		js.executeScript("AmazonHelpLocatorsObj.btnCloseVideo.click()");		}
	
	public void helpAndCustomer() throws Exception{
		AmazonHelpLocatorsObj.helpHomepage.isDisplayed();
		Thread.sleep(2000);
	
	}
}
