package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCustomer;
import pages.BalanceEnquiry;
import pages.LoginPage;
import pages.NewAccount;

public class BalanceEnquiryTest extends BaseTest {
	
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
	 
	 public void balanceenquiry() throws IOException {
		 
		 BalanceEnquiry be1=PageFactory.initElements(driver,BalanceEnquiry.class);
		 
		 be1.onClickBalanceEnquiry();
		 be1.setBe();
		 be1.onClickS4();
	 }
  
}
