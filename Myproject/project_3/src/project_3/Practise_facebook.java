package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("lidiyaraj07@gmail.com");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		
		WebElement login=driver.findElement(By.name("login"));
		System.out.println(login.isDisplayed());
		
	}

}
