package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class LoginPage extends Utility{
	
	public LoginPage(WebDriver driverInstance) {
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
	public static void EnterCredentials(String a, String b) throws Exception
	{
		sendKeys(PageObjects.Email,a);
		sendKeys(PageObjects.Password,b);
		
		explicitWait(2);
		
		pressEnter();

		explicitWait(2);
		
	}
	
	public static void VerifyLoginspage() {
		
		boolean a=driver.findElement(By.linkText("View your order history")).getText().contains("View your order");
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	
}
