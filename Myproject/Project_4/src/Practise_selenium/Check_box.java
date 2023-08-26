package Practise_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class Check_box {
	
 WebDriver driver;
 
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver","src/driver_1/chromedriver.exe");
		 driver=new ChromeDriver();
		
		  
		driver.get("https://www.testandquiz.com/selenium/testing.html");
	
		
		driver.manage().window().maximize();  
	  	  
	  
	  
  }

//  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }
  
  @Test
  public void SampleWebpage() {

	  //locating elements by tag and id
	  
WebElement test=driver.findElement(By.cssSelector("input#fname"));

test.sendKeys("Locating elements");	  

WebElement button=driver.findElement(By.cssSelector("button#idOfButton"));
button.click();
	  
	  
WebElement rad=driver.findElement(By.cssSelector("input#female"));
rad.click();

//locating elements by using tag and class

	  
WebElement check=driver.findElement(By.cssSelector("input.Automation"));
check.click();

WebElement drop=driver.findElement(By.id("testingDropdown"));
Select box=new Select(drop);
box.selectByVisibleText("Automation Testing");


	  
	  
	  
	  
  }

}
