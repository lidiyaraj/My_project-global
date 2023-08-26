package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
        WebElement source=driver.findElement(By.id("credit2"));
        WebElement destination=driver.findElement(By.id("bank"));
        Actions builder=new Actions(driver);
        builder.dragAndDrop(source,destination).build().perform();
        
        WebElement source1=driver.findElement(By.id("credit1"));
        WebElement destination1=driver.findElement(By.id("loan"));
        builder.dragAndDrop(source1,destination1).build().perform();
        
        WebElement source2=driver.findElement(By.id("credit3"));
        WebElement destination2=driver.findElement(By.id("amt7"));
        builder.dragAndDrop(source2,destination2).build().perform();
        
        
        
        
	}

}
