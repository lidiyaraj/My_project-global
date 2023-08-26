package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class NextPage {

	@FindBy(xpath="//strong[text()=\"Supremo Astute Technologies\"]")
	WebElement supremo ;
	
	@FindBy(xpath="//div/div/div[1]/div[6]/a/img")
	WebElement review;
	
	public void onClickSup() {
		supremo.click();		
	}

	public void onClickWrite() {
		review.click();
	}
	
  
}
