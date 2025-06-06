package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base_page {

	/*
	 * this class contains only constructor
	 * -->to invoke pom constructor
	 */
	public WebDriver driver;
	
	public base_page(WebDriver driver) {
			//from child page object class the driver is invoked and initialized

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
}
