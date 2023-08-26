package listernersp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generics.ListenerImplementation;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenerImplementation.class)

public class Reporting {
		
	@Test	 
	public void demo(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		assertEquals(false,true);	
	}

}