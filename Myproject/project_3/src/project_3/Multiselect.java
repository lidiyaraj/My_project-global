package project_3;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement multiselect_drop=driver.findElement(By.id("fruits"));
		Select fruits=new Select(multiselect_drop);
		Assert.assertTrue(fruits.isMultiple());
		List<WebElement> list=fruits.getOptions();
		for(WebElement element:list)
			System.out.println(element.getText());
		
		
		
				fruits.selectByIndex(0);
				fruits.selectByIndex(1);
				fruits.selectByIndex(2);
				List<WebElement> selected_list=fruits.getAllSelectedOptions();
				for(WebElement element:selected_list)
					System.out.println("selected options are:"+element.getText());
				fruits.deselectAll();
				driver.quit();
				
				

	}

}
