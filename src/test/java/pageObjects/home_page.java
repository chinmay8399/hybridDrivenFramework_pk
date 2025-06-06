package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home_page extends base_page{

	public WebDriver driver;
	
	public home_page(WebDriver driver) {
		super(driver);//invoking parent class constructor using super keyword
		//passing driver to parent class constructor, we get driver form properties files
	}

	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}

	public void clickRegister()
	{
		lnkRegister.click();
	}

	public void clickLogin()
	{
		lnkLogin.click();
	}
	
}
