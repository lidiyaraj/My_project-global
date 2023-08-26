package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCustomer;
import pages.LoginPage;
import pages.MiniStatement;
import pages.NewAccount;

public class MiniStatementTest extends BaseTest{
	
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
	 
	 public void account() throws IOException {
		 NewAccount na=PageFactory.initElements(driver,NewAccount.class);
		 
		 
		 na.onClickNewAccount();
		 na.setCust_id();
		 na.setInitial_deposit();
		 na.onClickSub();
		 na.acknowledgeRegistration();
		 na.getAccount_id();
	 }
	 
	 @Test(priority=3)
	 
	 public void ministatement() throws IOException {
		 
		 MiniStatement ms=PageFactory.initElements(driver,MiniStatement.class);
		 
		 ms.onClickMiniStatement();
		 ms.setMs();
		 ms.onClickS6();
	 }
  
}
