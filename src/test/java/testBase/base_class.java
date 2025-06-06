package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class base_class {

		
	public static WebDriver driver;
	public Logger logger;	
	public Properties p;
		@BeforeClass(groups= {"sanity","Master","dataDriven"})
		@Parameters({"browser"})
		public void setup(String br) throws IOException
		{
			//load config.prperties file
			FileReader file=new FileReader(".//src//test//resources//config.properties");		
			p=new Properties();
			p.load(file);
			
			//log4j2
			logger=LogManager.getLogger(this.getClass());
			
			switch(br.toLowerCase())
			{
			case "chrome":driver=new ChromeDriver();
			break;
			case "edge":driver=new EdgeDriver();
			break;
			default:System.out.println("invalid browser");
			return;//return -->exit from testCase execution not executing further
			}
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(p.getProperty("appURL"));//reading url from properties file
			driver.manage().window().maximize();
		}
		
		@AfterClass(groups= {"sanity","Master","dataDriven"})
		public void tearDown()
		{
		driver.quit();	
		}
		
		//paste all reusable and common methods here
		public String randomString()
		{
			String randomStr=RandomStringUtils.randomAlphabetic(5);//5 characters in random generated string
			return randomStr;
		}
		public String randomNum()
		{
			String randomNo=RandomStringUtils.randomNumeric(10);//10 random 10 digits for ph no
			return randomNo;
		}
		public String randomAlphaNumeric()
		{
			String randomStr=RandomStringUtils.randomAlphabetic(3);//10 random 10 digits for ph no
			String randomNo=RandomStringUtils.randomNumeric(3);//10 random 10 digits for ph no
			String alphaNum=randomStr+"@"+randomNo;
			return alphaNum;
		}
		
		//common method for taking ss
		public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;

		}

	}
