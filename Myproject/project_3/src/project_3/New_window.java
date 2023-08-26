package project_3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		WebElement click_link=driver.findElement(By.linkText("Click Here"));
		click_link.click();
		String parent_window=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i=s1.iterator();
        while(i.hasNext())
        {
        	String child_window=i.next();
        	if(!parent_window.equalsIgnoreCase(child_window)) {
        		driver.switchTo().window(child_window);
        		WebElement email=driver.findElement(By.name("emailid"));
        		email.sendKeys("kuttu@gmail.com");
        		WebElement sub1=driver.findElement(By.name("btnLogin"));
        		sub1.click();
        		driver.close();
        	}
        }
        driver.switchTo().window(parent_window);
        driver.quit();
        	}
        
	}


