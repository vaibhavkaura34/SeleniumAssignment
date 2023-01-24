package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class SearchPage extends Utility{
	
	public SearchPage(WebDriver driverInstance) {
        driver = driverInstance;
    }
	
	public static void launchApp() throws Exception {
        AutomationBase.launchApp("http://tutorialsninja.com/demo/");
        explicitWait(2);
        logger.info("Tutorials Ninja is launched");
    }
	
	public static void ClickAccount() throws Exception
	{
		clickElement(PageObjects.Account);
		explicitWait(2);
		
	}
	
	public static void ClickLogin() throws Exception
	{
		clickElement(PageObjects.Login);
		explicitWait(2);
		
	}
	public static void ClickSearch() throws Exception
	{
		clickElement(PageObjects.search);
		explicitWait(2);
		
	}
	public static void EnterSearch() throws Exception
	{
		sendKeys(PageObjects.search,"phone");
		explicitWait(2);
		
	}
	
	public static void VerifySearch() {
		
		boolean a=driver.findElement(By.xpath("//a[text()=\"iPhone\"]")).getText().contains("Phone");
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	
	

}
