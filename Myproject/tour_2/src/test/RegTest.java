package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FlightPage;
import pages.RegistrationPage;
import pages.SignPage;

public class RegTest extends BaseTest {
	
	@Test(priority=0)
	public void register1() throws IOException {
		  RegistrationPage rp=PageFactory.initElements(driver,RegistrationPage.class);
		  
		  
		  rp.setFname();
		  rp.setLname();
		  rp.setPhone();
		  rp.setEmail();
		  rp.setAddress();
		  rp.setCity();
		  rp.setState();
		  rp.setPostalcode();
		  rp.setCountry_drop();
		  rp.setUsername();
		  rp.setPassword();
		  rp.setConfirm();
		  rp.onClickSubmit();
 
	}
	
@Test(priority=1)
	
	public void sign() throws IOException {
		
		SignPage sp=PageFactory.initElements(driver,SignPage.class);
		
		sp.onClickSign();
		sp.setUsername();
		sp.setPassword();
		sp.onClickSumit();
		  
	}

@Test(priority=2)

public void flight() throws Throwable {
	
	FlightPage fp=PageFactory.initElements(driver,FlightPage.class);
	
fp.onClickFlight();
fp.onClickType();
fp.setPassenger();
fp.setDeparture();
fp.setMonth();
fp.setDay();
fp.setArrival();
fp.setReturn();
fp.setDate();
fp.setService("Business");
fp.setAirlines();
fp.onClickCon();

}
}
 
	

