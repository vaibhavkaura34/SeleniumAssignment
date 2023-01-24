package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageobjects.LoginPage;
import pageobjects.ReviewPage;
import pageobjects.SearchPage;
import utilities.Utility;

public class search extends Utility{
	
	public search(WebDriver driverInstance) {
        super(driverInstance);
    }
    public search() {
    }
	
	@Given("The customer is on home page")
	public void the_customer_is_on_home_page() throws Exception {
		try {
            LoginPage.launchApp();
            } catch (Exception e) {
            throw e;
        }
	}

	@When("he enters an item to search")
	public void he_enters_an_item_to_search() throws Exception {
		try {
			SearchPage.ClickSearch();
			SearchPage.EnterSearch();
			pressEnter();
        }
		catch (Exception e) {
            throw e;
        }
	}

	@Then("the user clicks on search button")
	public void the_user_clicks_on_search_button() {
		SearchPage.VerifySearch();
	    
	}

}
