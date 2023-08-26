package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		WebElement emailInput=driver.findElement(By.id("email"));
		WebElement email_textfield=driver.findElement(By.name("email"));
		WebElement email1_textfield=driver.findElement(By.linkText("Forgotten account?"));
		WebElement email2_textfield=driver.findElement(By.tagName("td"));
		WebElement email3_textfield=driver.findElement(By.className("gLFyf gsfi"));


	}

}
