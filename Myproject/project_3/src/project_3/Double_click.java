package project_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement button2=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
Actions builder=new Actions(driver);
builder.doubleClick(button2).build().perform();

Alert alert1=driver.switchTo().alert();
Thread.sleep(2000);
alert1.accept();
		
		//right click
		WebElement button1=driver.findElement(By.cssSelector(".context-menu-one"));
		builder.contextClick(button1).build().perform();
		WebElement menu2=driver.findElement(By.cssSelector(".context-menu-item"));
		menu2.click();
		
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
	}

}
