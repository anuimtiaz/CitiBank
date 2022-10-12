package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSignInLocators {

		//Mouseover Account list
		@FindBy (xpath="//a[@id='nav-link-accountList']")
		public WebElement linkSignIn;
	
		//Select Sign In
		@FindBy (xpath="//a[@data-nav-ref='nav_signin']")
		public WebElement btnSignIn;
		
		//Enter Email or Mobile Phone 
		@FindBy (xpath="//input[@id='ap_email']")
		public WebElement linkUserID;
		
		//Click on Continue
		@FindBy (xpath="//input[@id='continue']")
		public WebElement btnContinue;
		
		//Enter Password
		@FindBy (xpath="//input[@id='ap_password']")
		public WebElement linkPassword;
		
		//Click Sign In
		@FindBy (xpath="//input[@id='signInSubmit']")
		public WebElement clickSignIn;
		
		//User Sign In and Homepage Appear
		@FindBy (xpath="//span[@id='glow-ingress-line2']")
		public WebElement appHomepage;
	
}
