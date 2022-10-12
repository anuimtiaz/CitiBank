package upskill.amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.RahulHomepageActions;

public class RahulHomepageSteps {

	RahulHomepageActions RahulHomepageActionsObj = new RahulHomepageActions();

//------Ama-05-Iframe	
	@Given("^Open Shetty Homepage$")
	public void open_Shetty_Homepage() throws Throwable {
		RahulHomepageActionsObj.loadRahulHomepage();
	}

	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		RahulHomepageActionsObj.switchRahulIframe();
		RahulHomepageActionsObj.clickHome();
	}

	@Then("^It Should Reload Iframe Homepage$")
	public void it_Should_Reload_Iframe_Homepage() throws Throwable {
		RahulHomepageActionsObj.verifyRahul();
	}

	
}
