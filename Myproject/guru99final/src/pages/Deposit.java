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

public class Deposit {
WebDriver driver;
	
	
	public Deposit(WebDriver driver) {
		this.driver=driver;
	}
	
		
	@FindBy(how=How.LINK_TEXT,using="Deposit")
	WebElement Deposit;
	
	
	@FindBy(name="accountno")
	 WebElement ac_no;
	
	
	@FindBy(name="ammount")
	WebElement amount;
	
	@FindBy(name="desc")
	WebElement description;
	
	@FindBy(name="AccSubmit")
	WebElement Acc;
	
 
	public void onClickDeposit() {
		
		driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");	
		}

		public void setAc_no() throws IOException {
			
			ac_no.sendKeys(readExel(2,1,"account"));

		}
		
		public void setAmount() throws IOException {
			
			amount.sendKeys(readExel(1,1,"deposit"));
		}
		
	public void setDescription() throws IOException {
		
		 description.sendKeys(readExel(2,1,"deposit"));
	}


		public void OnclickAcc() {
			Acc.click();
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



