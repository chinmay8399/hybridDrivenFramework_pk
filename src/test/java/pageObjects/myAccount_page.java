package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccount_page extends base_page{

	public myAccount_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h2[text()='My Account']")
	WebElement myAcc;
	
	@FindBy(linkText="Logout")
	WebElement clickLogout;
	
	@FindBy(linkText="Continue")
	WebElement clickCont;
	
	
	public void clkLogout()
	{
		clickLogout.click();
	}
	
	public void clkCont()
	{
		clickCont.click();
	}
	
	
	public String myAccText()
	{
		return myAcc.getText();
	}
	
	public boolean txtExists()
	
		{
		try
			{
				return(myAcc.isDisplayed());
			}
	
	catch(Exception e)
		{
			return false;
		}
	
	}
}
