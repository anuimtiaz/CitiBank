package upskill.amazon.pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.amazon.pageElements.AmazonHomepageLocators;
import upskill.amazon.pageElements.AmazonSearchResultLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonSearchResultActions {

	AmazonSearchResultLocators AmazonSearchResultLocatorsObj;


	public AmazonSearchResultActions() {
		AmazonSearchResultLocatorsObj = new AmazonSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultLocatorsObj);
		
	}
//------Ama-01-Shoes
	public void verifyShoes() throws Exception {
	AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
	Thread.sleep(2000);
	
	}
//------Ama-02-BrandOutline
	public void filterBrand(String brand) throws Exception {
		if(brand.equals("Adidas")){
		AmazonSearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Under Armour")){
			AmazonSearchResultLocatorsObj.cbxBrandUnderArmour.click();
		} else if(brand.equals("Premium Brands")){
			AmazonSearchResultLocatorsObj.cbxBrandHanes.click();
		} else {
		System.out.println(" Brand not found, please implement");
		}
		Thread.sleep(2000);
		}	

	public void verifyBrandItems(String brand) throws Exception {
		if(brand.equals("Adidas")){
			AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
		} else if(brand.equals("Under Armour")){
				AmazonSearchResultLocatorsObj.txtShirts.isDisplayed();
		} else if(brand.equals("Premium Brands")){
				AmazonSearchResultLocatorsObj.txtPants.isDisplayed();
		} else {
		System.out.println(" Brand not found, please implement");
		}
		Thread.sleep(2000);
	}
	public void selectShirt() throws Exception {
		AmazonSearchResultLocatorsObj.linkShirt.click();
		Thread.sleep(2000);
	}

//------Ama-08-LogoClickable
	public void verifyLaptop() throws Exception {
		AmazonSearchResultLocatorsObj.vfyLaptop.isDisplayed();	
		Thread.sleep(2000);
	}
	public void clickLogo() throws Exception {
		AmazonSearchResultLocatorsObj.btnLogo.click();
		Thread.sleep(2000);
	}
		
//------Ama-10-Career
	public void searchJob() throws Exception {
		AmazonSearchResultLocatorsObj.txtJobSearch.sendKeys(ReadExcelSheet.getMapData("AmaCareer-01"));
		Thread.sleep(2000);
		}	
	public void searchLocation() throws Exception{
		AmazonSearchResultLocatorsObj.txtJobLocation.sendKeys(ReadExcelSheet.getMapData("AmaCareer-02"));
		Thread.sleep(2000);
	}
	public void clickJobSearch() throws Exception {
		AmazonSearchResultLocatorsObj.btnJobSearch.click();	
		Thread.sleep(2000);
	}
	public void jobSearchPage() throws Exception {
		AmazonSearchResultLocatorsObj.jobHomepage.isDisplayed();
		Thread.sleep(2000);
	}
}
