package project_3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.name("login"));
		System.out.println(login.getAttribute("class"));
		System.out.println(login.getTagName());
		Assert.assertTrue(login.isDisplayed());
		System.out.println("element is displayed");
		
		Assert.assertTrue(login.isEnabled());
		System.out.println("element is enabled");
		
		System.out.println(driver.getTitle());
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("test passed");
		
		Assert.assertNotEquals("Facebook – log in or sign up", driver.getTitle());
				System.out.println("test passed");
		
		driver.get("https://www.google.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	//	WebElement login1=driver.findElement(By.name("login"));
	     System.out.println(login.getText());
		

	}

}
