package project_3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();

		WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys("mngr280982");
		System.out.println(username.isDisplayed());
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("qyhUdYm");
		System.out.println(password.isDisplayed());
		
WebElement login=driver.findElement(By.name("btnLogin"));
System.out.println(login.isSelected());
System.out.println(login.getText());

Alert alert=driver.switchTo().alert();
alert.dismiss();
login.click();


		
		
		
	
		
		
	}

}
