package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_uploader {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement file=driver.findElement(By.id("uploadfile_0"));
		WebElement c=driver.findElement(By.id("terms"));
		
		
		String location="C:\\Users\\USER\\Documents\\D1.docx";
       // file.click();
        file.sendKeys(location);
        c.click();
        System.out.println(c.isSelected());
        WebElement sub=driver.findElement(By.id("submitbutton"));
        sub.click();
	}

}
