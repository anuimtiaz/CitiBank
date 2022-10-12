package upskill.amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonHomepageActions;

public class AmazonHomepageSteps {

	AmazonHomepageActions AmazonHomepageActionsObj = new AmazonHomepageActions();
	
//------Ama-01-Shoes	
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {		
	}
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		AmazonHomepageActionsObj.searchShoes();	
	}
//------Ama-02-BrandOutline
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		AmazonHomepageActionsObj.searchItems(items);
	}
	@Given("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		AmazonHomepageActionsObj.searchShirt();
	}
//------Ama-04-Mousehover	
	@When("^Mousehover to Prime$")
	public void mousehover_to_Prime() throws Throwable {
		AmazonHomepageActionsObj.mousehoverPrime();
	}
	@Then("^Click on Try Prime$")
	public void click_on_Try_Prime() throws Throwable {
		AmazonHomepageActionsObj.clickTryPrime();
	}

//------Ama-08-LogoClickable
	@When("^Search for Laptop$")
	public void search_for_Laptop() throws Throwable {
		AmazonHomepageActionsObj.searchLaptop();
	}
	@Then("^Amazon Homepage Should Appear$")
	public void amazon_Homepage_Should_Appear() throws Throwable {
		AmazonHomepageActionsObj.logoHomepage();
	}
	
//------Ama-10-Career	
	@When("^Click on Career$")
	public void click_on_Career() throws Throwable {
		AmazonHomepageActionsObj.searchCareer();
	}
//-----
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
