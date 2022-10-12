package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonHelpActions;

public class AmazonHelpSteps {
	AmazonHelpActions AmazonHelpActionsObj = new AmazonHelpActions();
//------Ama-09-Help
	@When("^Click on Help$")
	public void click_on_Help() throws Throwable {
		AmazonHelpActionsObj.clickHelp();
	}
//------Ama-09-Help
	@When("^Click on Track Your Package$")
	public void click_on_Track_Your_Package() throws Throwable {
		AmazonHelpActionsObj.trackYourPackage();
	}
	@When("^Play Video$")
	public void play_Video() throws Throwable {
		AmazonHelpActionsObj.switchNewWindow();
		AmazonHelpActionsObj.playVideo();
	}
	@When("^Close The Video$")
	public void close_The_Video() throws Throwable {
		AmazonHelpActionsObj.closeVideo();
	}
	@Then("^Help and Customer Service Page Should Appear$")
	public void help_and_Customer_Service_Page_Should_Appear() throws Throwable {
		AmazonHelpActionsObj.helpAndCustomer();
	}





}
