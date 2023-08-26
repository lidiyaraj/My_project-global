package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
 
	public WebDriver driver;
	  
  @BeforeSuite
  public void initialize() {
	  
	  System.setProperty("webdriver.chrome.driver", "src/driver_1/chromedriver.exe"); 
		 driver = new ChromeDriver();
	     driver=new ChromeDriver();
		driver.get("https://www.exemplar-education.com/");
		driver.manage().window().maximize(); 
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver_1.quit();
  
  }

}
