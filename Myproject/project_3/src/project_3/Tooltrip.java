package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		//driver.navigate().to("https://www.facebook.com/");
		driver.get(" http://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		WebElement rss=driver.findElement(By.className("rss"));
		Actions builder=new Actions(driver);
		builder.moveToElement(rss).build().perform();
		System.out.println(rss.getAttribute("title"));
		
		WebElement facebook=driver.findElement(By.className("icon"));
		builder.moveToElement(facebook).build().perform();
		System.out.println(facebook.getAttribute("github"));
		
		
		
		

	}

}
