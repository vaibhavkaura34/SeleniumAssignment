package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.ListPage;
import utilities.Utility;

public class list extends Utility {
	
	public list(WebDriver driverInstance) {
        super(driverInstance);
    }
    public list() {
    }
	
	@Given("The user is in home page")
	public void the_user_is_in_home_page() throws Exception {
		try {
            LoginPage.launchApp();
            } catch (Exception e) {
            throw e;
        }
	}

	@When("the user clicks on a product")
	public void the_user_clicks_on_a_product() throws Exception {
		try {
			ListPage.Clickphones();
			ListPage.Clicksort();
			ListPage.Clickwishlist();
        } catch (Exception e) {
            throw e;
        }
	}

	@Then("the user uses the list option and adds to wishlist")
	public void the_user_uses_the_list_option_and_adds_to_wishlist() {
	    
		ListPage.Verifywishlist();
		
	}



}
