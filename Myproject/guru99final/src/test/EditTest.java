package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCustomer;
import pages.EditCustomer;
import pages.LoginPage;

public class EditTest extends BaseTest {
	
	
  @Test(priority=0)
  public void login() throws IOException {
	  LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
	  
	  lp.setUsername();
	  lp.setPassword();
	  lp.OnclickLogin();
  }

@Test(priority=1)
public void Add() throws IOException {
  
AddCustomer ac=PageFactory.initElements(driver,AddCustomer.class);

       ac.onClickCustomerlink();
        ac.setCustomer();
        ac.onClickGender();
        ac.setDob();
        ac.setAddress();
        ac.setCity();
        ac.setState();
        ac.setPin();
        ac.setMob();
        ac.setEmail();
        ac.setPassword();
        ac.onClickSubmit();
        ac.acknowledgeRegistration();
        ac.getCustid();
        
}


@Test(priority=2)
public void Edit() throws IOException {
	
	EditCustomer ec=PageFactory.initElements(driver,EditCustomer.class);
	
	ec.onClickEditcustomer();
	ec.setE();
	ec.onClickEditcustomer();
}
}
  

