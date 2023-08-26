package project_3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/login/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		WebElement yDmH0d=driver.findElement(By.id("yDmH0d"));
		Assert.assertTrue(yDmH0d.isDisplayed());
		System.out.println("element is displayed");
		
		Assert.assertTrue(yDmH0d.isEnabled());
		System.out.println("element is enabled");
		/*System.out.println(driver.getTitle());
		driver.get("https://www.google.com/");
				driver.navigate().back();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().forward();
				System.out.println(driver.getCurrentUrl());
				WebElement identifier=driver.findElement(By.name("identifier"));
				System.out.println(identifier.getText());*/
				
	}

}
