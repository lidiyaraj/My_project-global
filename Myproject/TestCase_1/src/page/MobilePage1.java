package page;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;


public class MobilePage1 {
  
	WebDriver driver;
	
	public MobilePage1(WebDriver driver) {
		this.driver=driver;
	}	
	
	@FindBy(xpath="//*//ol/li[1]/a[@class=\"level0 \"]")
	WebElement mobile;
	 
	 
	 @FindBy(how=How.XPATH,using="//div[2]/div[1]/div[3]/div[1]/div[1]/div/select")
	 WebElement sort;
	
	 
	 
	 
	
	 public void VerifyTitle() {
		 
		 String Title=driver.getTitle();
		 
		 System.out.println(Title);
		 
			
		 Assert.assertEquals(driver.getTitle(),"Home page");
		 
		 System.out.println("Title matched successfully");
		 					
		 }	
	 
	 public void onClickMob() {
			
		 mobile.click();
				
			}
	 
	 public void VerifyTitle1() {
		 
		 String Title1=driver.getTitle();
		 
		 System.out.println(Title1);
			
		  Assert.assertEquals(driver.getTitle(),"Mobile");
		  
		  System.out.println("Title1 matched successfully");
	} 
	 
	 
	 public void setSort() {
			
			Select s=new Select(sort);
			s.selectByVisibleText("Name");
		}	 
	 
	 public void Screenshot1() throws IOException {
			
			TakesScreenshot ts=((TakesScreenshot)driver);
			File source=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("G://lidiya2//postlogin3.jpg");
			FileUtils.copyFile(source, dest);
			
			
		} 
	 
	
	
}
