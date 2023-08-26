package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddcartPage;

public class AddcartTest extends BaseTest{
  @Test
  
  public void addcart() {
	  
	  AddcartPage ap=PageFactory.initElements(driver,AddcartPage.class);	
	  
	  
	  ap.onClickMob();
	  ap.AddCart();
	  ap.Edit();
	  ap.Quantity();
	  ap.Update();
	  ap.Error();
	  ap.Empty();
	  ap.Error_msg();
	  
	  
	  
  }
  
  
}
