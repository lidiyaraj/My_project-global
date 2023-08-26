package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Logintest extends BaseTest {
 
 @Test
 public void f() throws Exception{
	 LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
	  lp.clickLogin();
	  lp.setUsername();
	  lp.setPassword();
	  lp.clickSendButton();
	  lp.clickForgot();

	
	
}	
	
}
