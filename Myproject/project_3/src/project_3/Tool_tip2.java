package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_tip2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		WebElement download=driver.findElement(By.id("download_now"));
		Actions builder=new Actions (driver);
		builder.moveToElement(download).build().perform();
		WebElement whats_new=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/a"));
System.out.println(whats_new .getText());
	}

}
