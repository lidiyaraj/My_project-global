package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ProductPage;

public class ProductTest extends BaseTest {
	
	@Test
	
	public void product() throws IOException {
		
		 ProductPage pp=PageFactory.initElements(driver,ProductPage.class);	
		 
		 pp.onClickMob();
		 pp.GetTitle();
		 pp.setPrice();
		 pp.setName();
		 pp.setDetailprice();
		 pp.Compare();
		 
		
	}
  
}
