package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
WebElement email=driver.findElement(By.id("email"));

Actions builder=new Actions(driver);
builder.moveToElement(email)
.click()

.keyDown(Keys.SHIFT)
.sendKeys("a")
.keyUp(Keys.SHIFT)
.build().perform();

	}

}
