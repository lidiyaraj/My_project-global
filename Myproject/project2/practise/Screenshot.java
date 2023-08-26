package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.ScreenshotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		ScreenshotUtility ss = new ScreenshotUtility();
		System.out.println(ss.takingScreennshot(driver,"api"));
		}

}
