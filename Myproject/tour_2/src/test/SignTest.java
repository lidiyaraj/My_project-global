package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SignPage;

public class SignTest extends BaseTest {
	
	@Test 
	
	public void sign() throws IOException {
		
		SignPage sp=PageFactory.initElements(driver,SignPage.class);
		
		sp.onClickSign();
		sp.setUsername();
		sp.setPassword();
		sp.onClickSumit();
		  
	}
  
	
}
