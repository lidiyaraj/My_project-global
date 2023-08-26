package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage {
  
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

	@FindBy(xpath="//div[3]/header/div/div/nav/ul/li[9]/a[2]")
	WebElement log;
	
	@FindBy(name="h_username")
	WebElement username;
	
	@FindBy(name="j_password")
	WebElement password;
	
	@FindBy(xpath="//p[5]/span/span/label/span[2]/a")
	WebElement forgot;
	
	@FindBy(xpath="//div/div/div/form/p[6]/input")
	WebElement button;
	
	public void clickLogin() throws Exception{
		Actions builder=new Actions(driver);
		builder.moveToElement(log).click().build().perform();
		Thread.sleep(5000);
	}
	
	
public void setUsername() {
	username.sendKeys("lidiya");
}
	

	public void setPassword() {
		password.sendKeys("67859");
	}
	
	public void clickSendButton()throws Exception{
		button.click();
		Thread.sleep(5000);
	}
	
	public void clickForgot()throws Exception{
		forgot.click();
		Thread.sleep(5000);
	}
	
	
}
