package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		WebElement f1=driver.findElement(By.id("userName"));
		f1.sendKeys("Lidiya Raj");
		System.out.println(f1.isDisplayed());
		WebElement e1=driver.findElement(By.id("userEmail"));
		e1.sendKeys("lidiyaraj07@gmail.com");
		System.out.println(e1.isDisplayed());
		WebElement c1=driver.findElement(By.id("currentAddress"));
		c1.sendKeys("vineetham,kannur,kerala");
		System.out.println(c1.isDisplayed());
		WebElement p1=driver.findElement(By.id("permanentAddress"));
		p1.sendKeys("vineetham,kannur,kerala");
		System.out.println(p1.isDisplayed());
		WebElement sub=driver.findElement(By.id("submit"));
		System.out.println(sub.isDisplayed());
		
		
		

	}

}
