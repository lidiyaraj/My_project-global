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

public class NewAccount {
	WebDriver driver;
	
	 
	  public NewAccount(WebDriver driver) {
		  this.driver=driver;
	  }

	  
	  @FindBy(how=How.LINK_TEXT,using="New Account")
	  WebElement Newaccount;
	  
	  
@FindBy(how=How.NAME,using="cusid")
WebElement cust_id;


@FindBy(name="inideposit")
WebElement initial_deposit;


@FindBy(name="button2")
WebElement sub;


@FindBy(how=How.XPATH,using="//table[@id=\"account\"]/tbody/tr[4]/td[2]")
WebElement accountid_textfield;


public void onClickNewAccount() {
	
driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");	
}

public void setCust_id() throws IOException {
	
	 cust_id.sendKeys(readExel(0,1,"account"));

}


public void setInitial_deposit() throws IOException {
	
	initial_deposit.sendKeys(readExel(1,1,"account"));
}

public void onClickSub() {
	sub.click();
}


public void acknowledgeRegistration() {
	
	  WebDriverWait wait=new WebDriverWait(driver,50/*timeout in seconds*/);

	  	driver.switchTo().defaultContent();
	  	
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account")));
	  }

	  public void getAccount_id() throws IOException {
	  	
	  
		String acc_id1=accountid_textfield.getText();
	  	writeExel(2,1,acc_id1,"account");
	  }



public static String readExel(int row,int col,String file1)throws IOException{	  FileInputStream fs=new FileInputStream(".//Testdata//data1.xlsx");
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


