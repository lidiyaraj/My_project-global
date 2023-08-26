package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FlightPage;

public class FlightTest extends BaseTest {
	
@Test 
	
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