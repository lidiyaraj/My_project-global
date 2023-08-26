package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		//check box
		WebElement c1=driver.findElement(By.id("vfb-6-0"));
		c1.click();
		System.out.println(c1.isSelected());
		WebElement c2=driver.findElement(By.id("vfb-6-1"));
		c2.click();
		System.out.println(c2.isSelected());
		WebElement c3=driver.findElement(By.id("vfb-6-2"));
		System.out.println(c3.isSelected());
		
	//radio button
		WebElement r1=driver.findElement(By.name("webform"));
		r1.click();
		System.out.println(r1.isSelected());
		WebElement r2=driver.findElement(By.name("webform"));
		r2.click();
		System.out.println(r2.isSelected());
		WebElement r3=driver.findElement(By.name("webform"));
		r3.click();
		System.out.println(r3.isSelected());
		
      }

}
