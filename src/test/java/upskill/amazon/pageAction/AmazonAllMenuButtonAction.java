package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonAllMenuButtonLocators;
import upskill.utilities.SetupDrivers;

public class AmazonAllMenuButtonAction {

	AmazonAllMenuButtonLocators AmazonAllMenuButtonLocatorsObj;
	
	public AmazonAllMenuButtonAction () {
		
		AmazonAllMenuButtonLocatorsObj = new AmazonAllMenuButtonLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonAllMenuButtonLocatorsObj);	
	}
	
	public void openAllMenu() throws Exception{
		AmazonAllMenuButtonLocatorsObj.btnClickMenu.isEnabled();
		AmazonAllMenuButtonLocatorsObj.btnClickMenu.click();
		Thread.sleep(2000);
	}
	public void amazonFresh() throws Exception{
		AmazonAllMenuButtonLocatorsObj.linkAmazonFresh.isEnabled();
		AmazonAllMenuButtonLocatorsObj.linkAmazonFresh.click();
		Thread.sleep(2000);
	}
	public void allAmazonFresh() throws Exception{
		AmazonAllMenuButtonLocatorsObj.linkAllFresh.isEnabled();
		AmazonAllMenuButtonLocatorsObj.linkAllFresh.click();
		Thread.sleep(2000);
	}
	
	public void selectFresh() throws Exception {
		AmazonAllMenuButtonLocatorsObj.btnClickFresh.click();
		Thread.sleep(2000);
	}
	
	
}
