package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.amazon.pageElements.AmazonCartDropDownLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonCartDropDownActions {

	AmazonCartDropDownLocators AmazonCartDropDownLocatorsObj;
	
	public AmazonCartDropDownActions(){
		AmazonCartDropDownLocatorsObj = new AmazonCartDropDownLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonCartDropDownLocatorsObj);
	}

	public void selectMaterialType() throws Exception {
		AmazonCartDropDownLocatorsObj.btnMaterialType.click();
		Thread.sleep(5000);
	}

	public void selectColour() throws Exception {
		AmazonCartDropDownLocatorsObj.btnColor.click();
		Thread.sleep(2000);
	}

	public void selectSizeDD() throws Exception {
		Select dropDown = new Select(AmazonCartDropDownLocatorsObj.ddSize);
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("AmaCart-01"));
		Thread.sleep(2000);
	}

	public void selectQuantityDD() throws Exception {
		Select dropDown = new Select(AmazonCartDropDownLocatorsObj.ddQty);
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("AmaCart-02"));
		Thread.sleep(2000);
	}
	public void addToCart() throws Exception {
		AmazonCartDropDownLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
	}


}
