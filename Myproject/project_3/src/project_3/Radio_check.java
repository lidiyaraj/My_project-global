package project_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radio_check {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		//check box
		WebElement c1=driver.findElement(By.id("tree-node-home"));
		//c1.click();
		Actions builder=new Actions(driver);
		builder.moveToElement(c1).click().build().perform();
		System.out.println(c1.isSelected());
		

	}

}
