package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	public static WebDriver driver=null;
	  
	  @BeforeSuite
	  public void intialize() {
		  System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe"); 
			//WebDriver driver = new ChromeDriver();
		     driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
	}
	  

	  @AfterSuite
	  public void afterSuite() {
		  driver.quit();
	  }

}
