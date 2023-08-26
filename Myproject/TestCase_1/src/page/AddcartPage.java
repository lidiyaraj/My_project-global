package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class AddcartPage {
  
WebDriver driver;

	
	public AddcartPage(WebDriver driver) {
		this.driver=driver;
	}			
	
	@FindBy(how=How.XPATH,using="//div/div[3]/nav/ol/li[1]/a[@class=\"level0 \"]")
	WebElement mob;
	
	@FindBy(xpath="//button/span/span[text()=\"Add to Cart\"]")
	WebElement  add_to_cart;
	
	@FindBy(xpath="//tr/td[4]/ul/li/a[@title=\"Edit item parameters\"]")
	WebElement edit;
	
	@FindBy(how=How.NAME,using="qty")
	WebElement qty;
	
	@FindBy(xpath="//button/span/span[text()=\"Update Cart\"]")
	WebElement update_cart;
		
	@FindBy(xpath="//span[text()=\"The maximum quantity allowed for purchase is 500.\"]")
	WebElement error;
	
	@FindBy(xpath="//span/span[text()=\"Empty Cart\"]")
	WebElement empty;
	
	@FindBy(xpath="//div/div/div[1]/h1[text()=\"Shopping Cart is Empty\"]")
	WebElement error_msg;
	
	public void onClickMob() {
		
		 mob.click();
	}
	
public void AddCart() {
	
	 add_to_cart.click();
	
}
	

 public void Edit() {
		
	 edit.click();
		
	}
	
	public void Quantity() {
		
		qty.clear();
		qty.sendKeys("1000");
	}
	
	public void Update() {
		
		 update_cart.click();
		
		
	}
	
public void Error() {
	
   String e=error.getText();
   
   System.out.println(e);

	String a="The maximum quantity allowed for purchase is 500.";
   
	Assert.assertEquals(e,a);
	
	System.out.println("Error message is displayed");
	
}

	
public void Empty() {
	

	 empty.click();
	  
	 
}
	
	public void Error_msg() {
		
		  String empty_cart=error_msg.getText();
		
		System.out.println(empty_cart);
		
		String m="SHOPPING CART IS EMPTY";
		
		Assert.assertEquals(empty_cart,m);
		
		System.out.println("SHOPPING CART IS EMPTY");

	}
}
