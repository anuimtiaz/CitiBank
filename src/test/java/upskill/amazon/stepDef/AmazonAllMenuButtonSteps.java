package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonAllMenuButtonAction;

public class AmazonAllMenuButtonSteps {

	AmazonAllMenuButtonAction AmazonAllMenuButtonActionObj = new AmazonAllMenuButtonAction();
	
//------Ama-07-AllMenu
	@When("^Open All Menu$")
	public void open_All_Menu() throws Throwable {
		AmazonAllMenuButtonActionObj.openAllMenu();
	}
	@When("^Select Amazon Fresh$")
	public void select_Amazon_Fresh() throws Throwable {
		AmazonAllMenuButtonActionObj.amazonFresh();
	}
	@When("^Select All Amazon Fresh$")
	public void select_All_Amazon_Fresh() throws Throwable {
		AmazonAllMenuButtonActionObj.allAmazonFresh();
	}
//------Ama-07-AllMenu	
	@Then("^Item List Should Show Amazon Fresh Products$")
	public void item_List_Should_Show_Amazon_Fresh_Products() throws Throwable {
		AmazonAllMenuButtonActionObj.selectFresh();
	}
	
}
