package project_3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		//WebElements email1=driver.findElement(By.cssSelector(""));
		//WebElements email2=driver.findElement(By.cssSelector(""));
		//WebElements email3=driver.findElement(By.cssSelector(""));
		Assert.assertTrue(email.isDisplayed());
		System.out.println("test passed");
		Assert.assertTrue(email.isEnabled());
		System.out.println("element enabled");
		//element.getText();
		WebElement element=driver.findElement(By.xpath(" "));
		WebElement emailInput=driver.findElement(By.id(" "));
		System.out.println(emailInput.getAttribute(" "));
		WebElement c1=driver.findElement(By.id(" "));
		c1.click();
		System.out.println(c1.isSelected());
		WebElement c2=driver.findElement(By.id(" "));
		c2.click();
		WebElement c3=driver.findElement(By.id(" "));
		System.out.println(c3.isSelected());
		
		

	}
}