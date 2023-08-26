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
import org.testng.annotations.Test;

public class SignPage {
  
	WebDriver driver;
	
	public SignPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(name="userName")
	WebElement username;


	@FindBy(name="password")
	WebElement password;


	@FindBy(how=How.NAME,using="submit")
	WebElement sumit;
	
	
	
	public void onClickSign() {
		
		driver.get("http://demo.guru99.com/test/newtours/login.php");
	}

	public void setUsername() throws IOException {

		username.sendKeys(readExel(1,0,"Home")); 
	}


	public void setPassword() throws IOException {

		password.sendKeys(readExel(1,1,"Home"));	
	}


	public void onClickSumit() {
		sumit.click();
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
