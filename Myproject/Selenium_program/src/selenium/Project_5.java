package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Project_5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/driver_1/chromedriver.exe"); 
		 		
			WebDriver driver = new ChromeDriver();		     
			driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
			driver.manage().window().maximize();
			
		WebElement msg=driver.findElement(By.id("user-message"));
		msg.sendKeys("hi");
	
		WebElement button=driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/form/button"));
		Actions builder=new Actions(driver);
		builder.moveToElement(button).click().build().perform();
		
		WebElement a=driver.findElement(By.id("sum1"));
		a.sendKeys("10");
		
		WebElement b=driver.findElement(By.id("sum2"));
		b.sendKeys("15");
		
		WebElement gettotal=driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/form/button"));
		builder.moveToElement(gettotal).click().build().perform(); 
		
		Thread.sleep(50000);
		driver.quit();
	}



	}


