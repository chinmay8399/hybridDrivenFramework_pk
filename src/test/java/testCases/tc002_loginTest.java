package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.home_page;
import pageObjects.login_page;
import pageObjects.myAccount_page;
import testBase.base_class;

public class tc002_loginTest extends base_class{

	@Test(groups={"sanity","Master"})
	public void verifyLogin()
	{
		logger.info("**starting tc002_loginTest**");
		
		try
		{
		
		logger.info("**home_page**");
		home_page hp=new home_page(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		logger.info("**login_page**");
		login_page lp=new login_page(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPass(p.getProperty("password"));
		lp.clkLogin();
		
		logger.info("**myAccount_page**");
		myAccount_page mya=new myAccount_page(driver);
		System.out.println(mya.myAccText());
		
		boolean status=mya.txtExists();
		//actual vs expected->if failed then "message will be displayed in console"
		Assert.assertEquals(status, true, "login failed");
		if(status==true) {
			//click logout only for successful login
		logger.info("**click_logout**");
		mya.clkLogout();
		}
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		logger.info("**finished tc002_loginTest**");
		
		
	}
	
}
