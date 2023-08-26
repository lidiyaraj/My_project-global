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
		  System.setProperty("webdriver.chrome.driver", "src/d_1/chromedriver.exe"); 
			//WebDriver driver = new ChromeDriver();
		     driver=new ChromeDriver();
			driver.get("https://www.yet5.com/");
			driver.manage().window().maximize();
	}
	  

	  @AfterSuite
	  public void afterSuite() {
		  driver.quit();
	  }
}
