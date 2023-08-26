
	package practise;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

import generics.DataBaseUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
	public class ReadingData {
		//public static void main(String[] args) {
		//DataBaseUtility utility = new DataBaseUtility();
		//utility.establisingTheConnection("jdbc:mysql://localhost:3306/advanceselenium","root","root");
		//List<String> data = utility.readingData1("select * from students;","id");
		//for(String d:data) {
		//System.out.println(d);
		//		}
		//utility.ClosingDatabase();
		//}
		//}
		@Test	
		public void loginintoApp() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/login");
			DataBaseUtility utility = new DataBaseUtility();
			utility.establisingTheConnection("jdbc:mysql://localhost:3306/adavanceselenium","root","root");
			WebElement emailIdTF = driver.findElement(By.id("Email"));
			List<String> data = utility.readingData1("select * from students;","id");
			for(String d:data) {
				emailIdTF.sendKeys(d);
			}
			utility.ClosingDatabase();

		}	
	}	



























	
	

}
