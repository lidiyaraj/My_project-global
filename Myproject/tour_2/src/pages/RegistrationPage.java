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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationPage {
WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(name="phone")
	WebElement ph;
	
	
	@FindBy(how=How.ID,using="userName")
	WebElement email ;
	
	
	@FindBy(name="address1")
	WebElement address;
	
	
	@FindBy(name="city")
	WebElement city;
  
  
	@FindBy(name="state")
	WebElement state;
	
	
	@FindBy(name="postalCode")
	WebElement pc;
	
	
	@FindBy(name="country")
	WebElement country_drop ;
	
	
	@FindBy(name="email")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(name="confirmPassword")
	WebElement confirm;	
	
	@FindBy(how=How.NAME,using="submit")
	WebElement sub1;
	
	
	 
	 
	  
	  public void setFname() throws IOException {
		  
		  fname.sendKeys("keerthana");
		  
	  }
	  
	  
	 	 
	 public void setLname() throws IOException {
		 
		 lname.sendKeys("p s");	  
	 }
	 
	 
	  
	 public void setPhone() throws IOException {
		 
		 ph.sendKeys("9605031491");
	 }
	 
	 
	 
	 public void setEmail() throws IOException {
		 
		 email.sendKeys("keerthana@gmail.com");
	 }
	
	 public void setAddress() throws IOException {
		 address.sendKeys("Rose villa Hydrebad");
	
	 }
	 
	 
	 
	 public void setCity() throws IOException {
		 
		 city.sendKeys("vijayawada");
	 }
	 
	 
	 
	 public void setState() throws IOException {
		 
		 state.sendKeys("Andhra pradesh");
	 }
	 
	 
	 
	 public void setPostalcode() throws IOException {
		 
		 pc.sendKeys("560012");
	 }
	 
	 
	 public void setCountry_drop() throws IOException {
		 Select s = new Select(country_drop);
		 s.selectByVisibleText("ANGOLA");
	 }
	 
	 
public void setUsername() throws IOException {
	username.sendKeys("7734362920");
}
	
		 
public void setPassword() throws IOException {
	password.sendKeys("led7711");
}
	 

public void setConfirm() throws IOException {
	confirm.sendKeys("led7711");
	 
	  }
	 
	 
	  public void onClickSubmit() {
		  sub1.click();  
	}
  
public static  String readExel(int row,int col,String file1)throws IOException{	 
	FileInputStream fs=new FileInputStream(".//Testdata2/test1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fs);
XSSFSheet ws=wb.getSheet(file1);
XSSFCell cell=ws.getRow(row).getCell(col);
cell.setCellType(CellType.STRING);
String data=cell.toString();
return data;

}
public static void writeExel(int row,int col,String value,String file1)throws IOException{
	FileInputStream fs=new FileInputStream(".//Testdata2/test1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet ws=wb.getSheet(file1);
	Row r=ws.getRow(row);
	Cell cell=r.createCell(col);
	cell.setCellValue(value);
	FileOutputStream os=new FileOutputStream(".//Testdata2/test1.xlsx");
	wb.write(os);
	os.close();

}
}

