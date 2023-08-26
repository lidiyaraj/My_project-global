package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import org.junit.Assert;

public class ProductPage {

	WebDriver driver;

	String p,d;

	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}		


	@FindBy(how=How.XPATH,using="//*//ol/li[1]/a[@class=\"level0 \"]")
	WebElement mob;

	@FindBy(xpath="//span[@id=\"product-price-1\"]/span[@class=\"price\"]")
	WebElement price;

	@FindBy(xpath="//div[1]/div[3]/ul/li[1]/a/img[@id=\"product-collection-image-1\"]")

	WebElement sony;


	@FindBy(xpath="//span[@id=\"product-price-1\"]/span[@class=\"price\"]")

	WebElement detailprice;


	public void onClickMob() {

		mob.click();
	}

	public void GetTitle() {

		String m=driver.getTitle();
		Assert.assertEquals("Mobile",driver.getTitle());

	}

	public void setPrice() {

		String p=price.getText();
		System.out.println(p);
	}

	public void setName() {
		sony.click();
	}

	public void setDetailprice() {


		String d=detailprice.getText();

		System.out.println(d);
	}
	public void Compare() {

		Assert.assertEquals(p,d);
	}

}
