package project_3;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Drop_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country_drop=driver.findElement(By.name("country"));
		Select country=new Select(country_drop);
		country.selectByValue("ANGOLA");
		System.out.println(country.getFirstSelectedOption().getText());
		country.selectByVisibleText("BURUNDI");
		country.selectByIndex(15);
		
		WebElement fname=driver.findElement(By.name("firstName"));
		fname.sendKeys("keerthana");
		
		WebElement lname=driver.findElement(By.name("lastName"));
		lname.sendKeys("p s");
		
		WebElement ph=driver.findElement(By.name("phone"));
		ph.sendKeys("9605031491");
		
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("keerthana@gmail.com");
		
		WebElement address=driver.findElement(By.name("address1"));
		address.sendKeys("Rose villa Hydrebad");
		
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("vijayawada");
		
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Andhra pradesh");
		
		WebElement pc=driver.findElement(By.name("postalCode"));
		pc.sendKeys("560012");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("7734362920");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("led7711");
		
		WebElement confirm=driver.findElement(By.name("confirmPassword"));
		confirm.sendKeys("led7711");
		
		WebElement submit1=driver.findElement(By.name("submit"));
		submit1.click();

	}

}
