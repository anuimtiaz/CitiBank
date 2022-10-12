package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonCartDropDownActions;

public class AmazonCartDropDownSteps {

	AmazonCartDropDownActions AmazonCartDropDownActionsObj = new AmazonCartDropDownActions();

//------Ama-03-Cart	
	@When("^Select Material Type$")
	public void select_Material_Type() throws Throwable {
		AmazonCartDropDownActionsObj.selectMaterialType();
	}

	@When("^Select Color$")
	public void select_Color() throws Throwable {
		AmazonCartDropDownActionsObj.selectColour();
	}

	@When("^Select Size$")
	public void select_Size() throws Throwable {
		AmazonCartDropDownActionsObj.selectSizeDD();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		AmazonCartDropDownActionsObj.selectQuantityDD();
	}

	@Then("^Add to Cart$")
	public void add_to_cart() throws Throwable {
		AmazonCartDropDownActionsObj.addToCart();
	}
}
