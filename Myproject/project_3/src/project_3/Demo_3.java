package project_3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement cust_id=driver.findElement(By.name("cusid"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		cust_id.clear();
		cust_id.sendKeys("45009");
		submit.click();
		
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		submit.click();
		
		Alert alert2=driver.switchTo().alert();
		
		Assert.assertEquals("Do you really want to delete this Customer?",alert2.getText());
		alert2.accept();
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
		
		Assert.assertEquals("Customer Successfully Delete",alert1.getText());
		//System.out.println(alert1.getText());
		alert1.accept();
		driver.quit();
		
		

	}

}
