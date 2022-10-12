package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonSignInActions;

public class AmazonSignInSteps {

	AmazonSignInActions AmazonSignInActionsObj = new AmazonSignInActions();

	@When("^Mousehover to Account List$")
	public void mousehover_to_Account_List() throws Throwable {
		AmazonSignInActionsObj.mousehoverAccountList();
	}
	@When("^Click on Sign In$")
	public void click_on_Sign_In() throws Throwable {
		AmazonSignInActionsObj.signIn();
	}
	@When("^Enter Email or Mobile Phone Number$")
	public void enter_Email_or_Mobile_Phone_Number() throws Throwable {
		AmazonSignInActionsObj.enterEmailPhone();
	}
	@When("^Click on Continue$")
	public void click_on_Continue() throws Throwable {
		AmazonSignInActionsObj.clickContinue();
	}
	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		AmazonSignInActionsObj.enterPassword();
	}
	@When("^Click Sign-In$")
	public void click_Sign_In() throws Throwable {
		AmazonSignInActionsObj.clickSignIn();
	}
	@Then("^User Should Able to Sign-in and Homepage Appear$")
	public void user_Should_Able_to_Sign_in_and_Homepage_Appear() throws Throwable {
		AmazonSignInActionsObj.signInHomepage();
	}	
	
}
