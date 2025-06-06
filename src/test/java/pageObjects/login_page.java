package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page extends base_page{

	public login_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement enterPwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement clickLogin;
	
	public void setEmail(String inpEmail)
	{
		enterEmail.sendKeys(inpEmail);
	}
	
	public void setPass(String inpPwd)
	{
		enterPwd.sendKeys(inpPwd);
	}
	
	public void clkLogin()
	{
		clickLogin.click();
	}
	
}
