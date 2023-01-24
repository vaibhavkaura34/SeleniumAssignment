package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class ReviewPage extends Utility {
	
	public ReviewPage(WebDriver driverInstance) {
        driver = driverInstance;
    }
	
	public static void launchApp() throws Exception {
        AutomationBase.launchApp("http://tutorialsninja.com/demo/");
        explicitWait(2);
        logger.info("Tutorials Ninja is launched");
    }
	
	public static void Clickcamera() throws Exception
	{
		clickElement(PageObjects.camera);
		explicitWait(2);
		
	}
	
	public static void Clickreview() throws Exception
	{
		clickElement(PageObjects.writereview);
		explicitWait(2);
		
	}
	
	public static void Entername() throws Exception
	{
		sendKeys(PageObjects.yourName,"Vaibhav");
		explicitWait(2);
		
	}
	
	public static void Enterreview() throws Exception
	{
		sendKeys(PageObjects.enterReview,"Hey there, this product is amazing. Have a look at the features and do recommend it your loved ones!");
		explicitWait(2);
		
	}
	public static void GiverRating() throws Exception
	{
		clickElement(PageObjects.rating);
		explicitWait(2);
		
	}
	public static void ClickContinue() throws Exception
	{
		clickElement(PageObjects.continueButton);
		explicitWait(2);
		
	}
	public static void VerifyReview() {
		
		boolean a=driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]")).getText().contains("Thank you for your review.");
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	
	

}
