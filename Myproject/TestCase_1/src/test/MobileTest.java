package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MobilePage1;


public class MobileTest extends BaseTest {
 
	@Test
	
	public void mobile() throws IOException {
		
		 MobilePage1 mp=PageFactory.initElements(driver,MobilePage1.class);	
		 
		
		mp.VerifyTitle();
		mp.onClickMob();
		mp.VerifyTitle1();
		mp.setSort();
		mp.Screenshot1();
		
	}	
}
