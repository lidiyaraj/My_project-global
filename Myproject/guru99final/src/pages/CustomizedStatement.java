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

public class CustomizedStatement {
 
WebDriver driver;
	
	
	public CustomizedStatement(WebDriver driver) {
		
		this.driver=driver;
	}
	
		
	@FindBy(how=How.LINK_TEXT,using="Customised Statement")
	WebElement CustomizedStatement;
	
	
	@FindBy(name="accountno")
	WebElement an;
	
	
	@FindBy(name="fdate")
	WebElement fdate;
	
	
	@FindBy(name="tdate")
	WebElement tdate;
	
	
	@FindBy(name="amountlowerlimit")
	WebElement mt;
	
	@FindBy(name="numtransaction")
	WebElement nt;
	
	
	@FindBy(name="AccSubmit")
	WebElement cs;
	
 
	public void onClickCustomizedStatement() {
		
		driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");	
		
		}

		public void setAn() throws IOException {
			
			 an.sendKeys(readExel(2,1,"account"));

		}
		
	
		public void setFdate() throws IOException {
			
			 fdate.sendKeys("16/04/2019");

		}
		
		
		public void setTdate() throws IOException {
			
			tdate.sendKeys("29/01/2020");
			  

		}
	
				
		public void setMt() throws IOException {
			
			 mt.sendKeys("1000");

		}
		
		public void setNt() throws IOException{
			
			nt.sendKeys("5");
		}
 public void onClickCs() {
	 
	 cs.click();
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
	

