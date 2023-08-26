package pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddCustomer {
	WebDriver driver;
	
 
  public AddCustomer(WebDriver driver) {
	  this.driver=driver;
  }
  
  
 @FindBy(how=How.LINK_TEXT,using="New Customer")
 WebElement Customerlink;
  
 @FindBy(name="name")
	WebElement cust_name_textfield;

  
  
  @FindBy(name="rad1")
  WebElement gender;
  
  
  @FindBy(how=How.ID,using="dob")
  WebElement dob;
  
  
  @FindBy(name="addr")
  WebElement address;
  
  
  @FindBy(name="city")
  WebElement city;
  
  
  @FindBy(name="state")
  WebElement  state ;
  
  @FindBy(how=How.XPATH,using="//table[@id='customer']/tbody/tr[4]/td[2]")
	WebElement customerID_textfield;

  @FindBy(name="pinno")
  WebElement  pin ;
  
  @FindBy(name="telephoneno")
  WebElement mob;
  
  
  @FindBy(name="emailid")
  WebElement  email;
  
  
  @FindBy(name="password")
  WebElement password;
  
  
  @FindBy(how=How.NAME,using="sub")
	WebElement submit;
  
  
  public void onClickCustomerlink() {
	  driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
  }
  
  public void setCustomer() throws IOException {
	  
	  cust_name_textfield.sendKeys(readExel(0,1,"addCustomer"));
  }
 public void onClickGender() {
	 gender.click(); 
 }
 
 
 public void setDob() throws IOException {
	 
	 dob.sendKeys(readExel(1,1,"addCustomer"));	  
 }
 
 
 public void setAddress() throws IOException {
	 
	 address.sendKeys(readExel(2,1,"addCustomer"));
 }
 
 
 public void setCity() throws IOException {
	 
	 city.sendKeys(readExel(3,1,"addCustomer"));
 }
 
 
 public void setState() throws IOException {
	 
	 state.sendKeys(readExel(4,1,"addCustomer"));
 }
 
 
 public void setPin() throws IOException {
	 
	 pin.sendKeys(readExel(5,1,"addCustomer"));
 }
 
 
 public void setMob() throws IOException {
	 
	 mob.sendKeys(readExel(6,1,"addCustomer"));
 }

 
 public void setEmail() throws IOException {
	 
	 email.sendKeys(readExel(7,1,"addCustomer"));
 }
 
 
 public void setPassword() throws IOException {
	 
	 password.sendKeys(readExel(8,1,"addCustomer"));	  
 }
 
 
  public void onClickSubmit() {
	  
	  submit.click();  
}
  public void acknowledgeRegistration() {
		
	  WebDriverWait wait=new WebDriverWait(driver,50/*timeout in seconds*/);

	  	driver.switchTo().defaultContent();
	  	
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer")));
	  }

	  public void getCustid() throws IOException {
	  	
	  	String cust_id=customerID_textfield.getText();
	  	writeExel(0,1,cust_id,"account");
	  	
	  }
  

public static String readExel(int row,int col,String file1)throws IOException{	
	FileInputStream fs=new FileInputStream(".//Testdata//data1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fs);
XSSFSheet ws=wb.getSheet(file1);
XSSFCell cell=ws.getRow(row).getCell(col);
cell.setCellType(CellType.STRING);
String data=cell.toString();
return data;

}
public static void writeExel(int row,int col,String value,String file1)throws IOException{
	FileInputStream fs=new FileInputStream(".//Testdata/data1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet ws=wb.getSheet(file1);
	Row r=ws.getRow(row);
	Cell cell=r.createCell(col);
	cell.setCellValue(value);
	FileOutputStream os=new FileOutputStream(".//Testdata/data1.xlsx");
	wb.write(os);
	os.close();

}
}
