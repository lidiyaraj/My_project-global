package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class AddcomparePage {
	
	WebDriver driver;
	
	public void AddcomaprePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*//ol/li[1]/a[@class=\"level0 \"]")
	WebElement mob;	
	
	 @FindBy(how=How.LINK_TEXT,using="Add to Compare")
	  WebElement xperia;	
	
	@FindBy(xpath="//div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
	WebElement iphone;
	
	
	@FindBy(xpath="//span/span[text()=\"Compare\"]")
	WebElement compare;
	
	@FindBy(xpath="//span/span[text()=\"$100.00\"]")
	WebElement price1;
	
	@FindBy(xpath="//span/span[text()=\"$500.00\"]")
	WebElement price2;
	
	
	@FindBy(xpath="//div/div[1]/h1[text()=\"Compare Products\"]")
			
	WebElement compare_products;
	
	@FindBy(xpath="//button/span/span[text()=\"Close Window\"]")
	WebElement close_window;
	
	public void onClickMob() {
		
		 mob.click();
	}
	
	public void Sony() {
		
		xperia.click();
	}
	public void Compare() {
		
		compare.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
}
