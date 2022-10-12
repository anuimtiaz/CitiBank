package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonSearchResultActions;

public class AmazonSearchResultSteps {
	
	AmazonSearchResultActions AmazonSearchResultActionsObj = new AmazonSearchResultActions();
	
//------Ama-01-Shoes	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		AmazonSearchResultActionsObj.verifyShoes();
	}
//------Ama-02-BrandOutline
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		AmazonSearchResultActionsObj.filterBrand(brand);
			}
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		AmazonSearchResultActionsObj.verifyBrandItems(brand);
	}
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		AmazonSearchResultActionsObj.selectShirt();
	}	
	
	
//------Ama-08-LogoClickable
	@When("^Verify Laptop Page$")
	public void verify_Laptop_Page() throws Throwable {
		AmazonSearchResultActionsObj.verifyLaptop();
	}
	@When("^Click on Amazon Logo$")
	public void click_on_Amazon_Logo() throws Throwable {
		AmazonSearchResultActionsObj.clickLogo();
	}

//------Ama-10-Career
	@When("^Search for Job$")
	public void search_for_Job() throws Throwable {
		AmazonSearchResultActionsObj.searchJob();  
	}
	@When("^Search for Location$")
	public void search_for_Location() throws Throwable {
		AmazonSearchResultActionsObj.searchLocation();
	} 
	@When("^Click on Search$")
	public void click_on_Search() throws Throwable {
		AmazonSearchResultActionsObj.clickJobSearch();
	}
	@Then("^Job Search Result Should Appear$")
	public void job_Search_Result_Should_Appear() throws Throwable {
		AmazonSearchResultActionsObj.jobSearchPage();
	}	



}











