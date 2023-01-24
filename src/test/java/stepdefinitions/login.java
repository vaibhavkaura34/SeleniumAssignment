package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import utilities.Utility;

public class login extends Utility{
	
	public login(WebDriver driverInstance) {
        super(driverInstance);
    }
    public login() {
    }
	
	@Given("The user is at home page")
	public void the_user_is_at_home_page() throws Exception {
		try {
            LoginPage.launchApp();
            } catch (Exception e) {
            throw e;
        }
	    
	}

	@When("he clicks on login button")
	public void he_clicks_on_login_button() throws Exception {
		try {
			LoginPage.ClickAccount();
			LoginPage.ClickLogin();
        } catch (Exception e) {
            throw e;
        }
	}

	@And("enters the credentials {string} and {string}")
	public void enters_the_credentials_and(String string, String string2) throws Exception {
		try {
			LoginPage.EnterCredentials(string, string2 );
        } catch (Exception e) {
            throw e;
        }
	    
		
	}

	@Then("the user gets logged in")
	public void the_user_gets_logged_in() {
	    LoginPage.VerifyLoginspage();
	}


}
