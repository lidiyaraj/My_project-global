package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	public static WebDriver driver=null;
  
  @BeforeSuite
  public void intialize() {
	  System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
	     driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
}
  

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
