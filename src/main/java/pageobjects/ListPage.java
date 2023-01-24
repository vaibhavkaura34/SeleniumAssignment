package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class ListPage extends Utility{
	
	public ListPage(WebDriver driverInstance) {
        driver = driverInstance;
    }
	
	public static void launchApp() throws Exception {
        AutomationBase.launchApp("http://tutorialsninja.com/demo/");
        explicitWait(2);
        logger.info("Tutorials Ninja is launched");
    }
	
	public static void Clickphones() throws Exception
	{
		clickElement(PageObjects.phones);
		explicitWait(2);
		
	}
	
	
	public static void Clicksort() throws Exception
	{
		clickElement(PageObjects.list);
		explicitWait(2);
		
	}
	
	public static void Clickwishlist() throws Exception
	{
		clickElement(PageObjects.wishlist);
		explicitWait(2);
		
	}
	
	public static void Verifywishlist() {
		
		boolean a=driver.findElement(By.xpath("//a[text()=\"create an account\"]")).getText().contains("create");
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	

}
