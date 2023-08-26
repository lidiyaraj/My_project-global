package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pop_up {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "src/driver_1/chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();		     
			driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
			driver.manage().window().maximize();
			
			WebElement twitter=driver.findElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a"));
	         Actions builder=new Actions(driver);
	         builder.moveToElement(twitter).click().build().perform();
	         
	         
	         String parent_window=driver.getWindowHandle();
	 		Set<String> s1=driver.getWindowHandles();
	 		Iterator<String> i=s1.iterator();
	         while(i.hasNext())
	         {
	         	String child_window=i.next();
	         	if(!parent_window.equalsIgnoreCase(child_window)) {
	         		driver.switchTo().window(child_window);
	         		WebElement email=driver.findElement(By.name("session[username_or_email]"));
	         		email.sendKeys("xyz@gmail.com");
	         		WebElement password=driver.findElement(By.name("session[password]"));
	         		password.sendKeys("lid675");
	         		driver.close();
	         	}
	         }         
	         driver.switchTo().window(parent_window);
	         
	      WebElement facebook=driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[2]/div[2]/a"));   
	       
	         builder.moveToElement(facebook).click().build().perform();
	         
	         
	         String parent_window1=driver.getWindowHandle();
	         Set<String> s2=driver.getWindowHandles();
	         Iterator<String> j=s2.iterator();
	         while(j.hasNext())
	         {
	        	 
	        	 String child_window=j.next();
		         	if(!parent_window1.equalsIgnoreCase(child_window)) {
		         		driver.switchTo().window(child_window);
		         		WebElement email1=driver.findElement(By.id("email"));
		         		email1.sendKeys("abc@gmail.com");
		         		WebElement password1=driver.findElement(By.id("pass"));
		         		password1.sendKeys("34565");
		         		driver.close();
	        	 
	         }
	             }   	                  
	         driver.switchTo().window(parent_window1);

	         
	         
	         WebElement tf=driver.findElement(By.xpath("//div[2]/div[2]/div/div[2]/div[1]/a"));
	          builder.moveToElement(tf).click().build().perform();
	          
	          
	          String parent_window2=driver.getWindowHandle();
		         Set<String> s3=driver.getWindowHandles();
		         Iterator<String> k=s3.iterator();
		         while(k.hasNext())
		         {
		        	 
		        	 String child_window=k.next();
			         	if(!parent_window2.equalsIgnoreCase(child_window)) {
			         		driver.switchTo().window(child_window);
			         		WebElement e=driver.findElement(By.xpath("//div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/form/div/div[1]//div/input"));
			         		e.sendKeys("xyz@gmail.com");
			         		WebElement pass=driver.findElement(By.name("session[password]"));
			         		pass.sendKeys("lid675");
			         		driver.close();
			         	}
		         }
		         
		         driver.switchTo().window(parent_window2);
		           
		         Thread.sleep(50000);
	         driver.quit();
	         	}
	}



	


