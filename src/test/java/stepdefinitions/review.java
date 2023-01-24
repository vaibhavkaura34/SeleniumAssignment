package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.ReviewPage;
import utilities.Utility;

public class review extends Utility{
	
	public review(WebDriver driverInstance) {
        super(driverInstance);
    }
    public review() {
    }
	
	@Given("Customer is at home page")
	public void customer_is_at_home_page() throws Exception {
	    
		try {
            LoginPage.launchApp();
            } catch (Exception e) {
            throw e;
        }
		
		
	}

	@When("he cliks on a particular product")
	public void he_cliks_on_a_particular_product() throws Exception {
		try {
			ReviewPage.Clickcamera();
			
        } catch (Exception e) {
            throw e;
        }
	    
		
	}

	@And("he clicks on review")
	public void he_clicks_on_review() throws Exception {
	    
		try {
			ReviewPage.Clickreview();
			ReviewPage.Entername();
			ReviewPage.Enterreview();
			ReviewPage.GiverRating();
			ReviewPage.ClickContinue();
			
        } catch (Exception e) {
            throw e;
        }
	}

	@Then("review is submitted")
	public void review_is_submitted() {
	    ReviewPage.VerifyReview();
	}

}
