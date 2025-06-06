package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.accountRegistration_page;
import pageObjects.home_page;
import testBase.base_class;

public class tc001_accountRegistrationTest extends base_class{

	//every class is considered as 1 tc
	//every method is different step

	@Test(groups={"regression","Master"})	
	public void verify_account_registration()
	{
		
		//add message to logger file
		logger.info("****starting TC001_Account_Registration***");
		
		//if any step has an failure we keep all the steps in exception
		try {
		home_page hp=new home_page(driver);
		//driver is coming from base_class and going to the pom-base_test class for initialization using super keyWord from child class constructors 
		
		hp.clickMyAccount();
		logger.info("Clicked on myAccount");
		hp.clickRegister();
		logger.info("Clicked on registration");
		
		accountRegistration_page regpage=new accountRegistration_page(driver);

		logger.info("providing customer details");
		//feeding random testData-->commons dependency for random string
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomString());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		logger.info("validating expected message");
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			logger.error("test failed");
			logger.debug("debud logs");
			Assert.fail();
		}
	}

	
	
}
