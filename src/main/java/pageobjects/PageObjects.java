package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	
	public static WebDriver driver;
	

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	
	@FindBy(xpath="//span[@class=\"hidden-xs hidden-sm hidden-md\"] [text()=\"My Account\"]")
	public static WebElement Account;
	
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	public static WebElement Login;
	
	@FindBy(id="input-email")
	public static WebElement Email;  
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(linkText="Phones & PDAs")
	public static WebElement phones;
	
	@FindBy(xpath="//button[@id=\"list-view\"]")
	public static WebElement list;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]")
	public static WebElement wishlist;
	
	@FindBy(xpath="//a[text()=\"Canon EOS 5D\"]")
	public static WebElement camera;
	
	
	@FindBy(xpath="//a[text()=\"Write a review\"]")
	public static WebElement writereview;
	
	@FindBy(id="input-name")
	public static WebElement yourName; 
	
	@FindBy(id="input-review")
	public static WebElement enterReview; 
	
	
	@FindBy(xpath="//input[@value=\"5\"]")
	public static WebElement rating;
	
	
	@FindBy(id="button-review")
	public static WebElement continueButton; 
	
	@FindBy(xpath="//input[@name=\"search\"]")
	public static WebElement search;
	
	
	
}
