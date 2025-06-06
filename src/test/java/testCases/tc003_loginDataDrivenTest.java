package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.home_page;
import pageObjects.login_page;
import pageObjects.myAccount_page;
import testBase.base_class;
import utilities.dataProviders;

public class tc003_loginDataDrivenTest extends base_class{

	/*Data is valid  - login success - test pass  - logout
	Data is valid -- login failed - test fail

	Data is invalid - login success - test fail  - logout
	Data is invalid -- login failed - test pass
	*/
	
	//in @Test pass 2 parameters
	//specify dataprovider name and since the package and class is different pass dataProviderClass parameter and specify the class name
	@Test(dataProvider="loginData",dataProviderClass=dataProviders.class, groups="dataDriven")
	public void verify_loginDDT(String getEmail, String getPwd, String expRes)
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
		lp.setEmail(getEmail);
		lp.setPass(getPwd);
		lp.clkLogin();
		
		logger.info("**myAccount_page**");
		myAccount_page mya=new myAccount_page(driver);
		System.out.println(mya.myAccText());
		
		boolean status=mya.txtExists();
		//true->login successFul; false->login fail
		
		if(expRes.equalsIgnoreCase("valid"))
		{
			if(status==true)
			{
				mya.clkLogout();
				mya.clkCont();
				Assert.assertTrue(true);
				logger.info("**click_logout**");
				
			}
			else//for valid column still the accunt page not visible-->tc fail
			{
				Assert.assertTrue(false);
			}
		}
		
		if(expRes.equalsIgnoreCase("invalid")) //for invalid data-->negative tc
		{
			if(status==true)
			{
				mya.clkLogout();
				mya.clkCont();
				Assert.assertTrue(false);//for negative scenario as well we are able to login-->tc fail
				logger.info("**click_logout**");
				
			}
			else//invalid data-->login not successful-->tc is passed
			{
				Assert.assertTrue(true);
			}
		
		}
		
	}
		catch(Exception e)
		{
			Assert.fail();		
		}
	
}
}
