package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
driver.switchTo().frame("singleframe");
WebElement input1=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
input1.sendKeys("abcd");
driver.switchTo().parentFrame();
	}

}
