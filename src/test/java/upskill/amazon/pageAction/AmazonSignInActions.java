package upskill.amazon.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonSignInLocators;
import upskill.utilities.SetupDrivers;

public class AmazonSignInActions {

	AmazonSignInLocators AmazonSignInLocatorsObj;
	
	public AmazonSignInActions () {
		
		AmazonSignInLocatorsObj = new AmazonSignInLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSignInLocatorsObj);	
	}
	public void mousehoverAccountList() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonSignInLocatorsObj.linkSignIn);
		actions.perform();
		Thread.sleep(3000);	
	}	
	public void signIn() throws Exception {
		AmazonSignInLocatorsObj.btnSignIn.isEnabled();
		AmazonSignInLocatorsObj.btnSignIn.click();	
		Thread.sleep(2000);
	}
	public void enterEmailPhone() throws Exception {
		AmazonSignInLocatorsObj.linkUserID.sendKeys("imtiaj_anu@live.com");
		Thread.sleep(2000);
	}
	public void clickContinue() throws Exception {
		AmazonSignInLocatorsObj.btnContinue.click();
		Thread.sleep(2000);
	}
	public void enterPassword() throws Exception {
		AmazonSignInLocatorsObj.linkPassword.sendKeys("London_2011");
		Thread.sleep(2000);
	}
	public void clickSignIn() throws Exception {
		AmazonSignInLocatorsObj.clickSignIn.click();
		Thread.sleep(2000);
	}
	public void signInHomepage() throws Exception {
		AmazonSignInLocatorsObj.appHomepage.isDisplayed();
		Thread.sleep(6000);
	}	
}
