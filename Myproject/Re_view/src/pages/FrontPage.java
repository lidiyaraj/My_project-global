package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FrontPage {
  WebDriver driver;
  
  public FrontPage(WebDriver driver) {
		
		this.driver=driver;
 
}
  
  @FindBy(how=How.NAME,using="q")
	WebElement course ;
  
  @FindBy(id="query")
	WebElement city ;
	
@FindBy(xpath="//table/tbody/tr/td[3]/input")
WebElement search;
	
	
	public void setScources() {
		Select p=new Select(course);
		p.selectByVisibleText("Software Testing training institutes");
	}
	
	public void setCity_drop() throws IOException {
		 Select s = new Select(city);
		 s.selectByVisibleText("MANGLORE");
	}
	public void onClickSearch() {
		search.click();
	}
  
}