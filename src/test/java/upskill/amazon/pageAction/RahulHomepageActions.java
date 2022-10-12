package upskill.amazon.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.RahulHomepageLocators;
import upskill.utilities.SetupDrivers;

public class RahulHomepageActions {

	RahulHomepageLocators RahulHomepageLocatorsObj;
	
	public RahulHomepageActions(){
		
		RahulHomepageLocatorsObj = new RahulHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, RahulHomepageLocatorsObj);
	}
	
	public void loadRahulHomepage() throws Exception {
		Thread.sleep(2000);
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
	}

	public void switchRahulIframe() throws Exception {
		SetupDrivers.driver.switchTo().frame("iframe-name");
	}

	
	public void clickHome() throws Exception  {
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i = 0; i<(framelist.size());i++){
			SetupDrivers.driver.switchTo().frame(i);
			
			try{
				RahulHomepageLocatorsObj.btnHome.click();	
			} catch (Exception e){
				System.out.println("Element not found in that iframe list");
		}
		}
	}

	public void verifyRahul() throws Exception {
		Thread.sleep(3000);
		RahulHomepageLocatorsObj.btnHome.isDisplayed();
		Thread.sleep(3000);
		
	}

	
	
	
	
	
	
	
	public void handleIframe(){
		
		//i find iframe using iframe tag in DOM or HTML
		//i use switchTo().frame() to switch iframes
		
		//Switch iframe by index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		//Switch iframe by Name or Id
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("iframe2");
		SetupDrivers.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		
		//nested iframe
		SetupDrivers.driver.switchTo().frame("parent");
		SetupDrivers.driver.switchTo().frame("child");
		SetupDrivers.driver.switchTo().frame("inner");
	} 




}
