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

public class FundTransfer {
	
WebDriver driver;
	
	
	public FundTransfer(WebDriver driver) {
		
		this.driver=driver;
	}
	
		
	@FindBy(how=How.LINK_TEXT,using="Fund Transfer")
	WebElement FundTransfer ;
	
	
	
	@FindBy(name="payersaccount")
	 WebElement f;

	
	@FindBy(name="payeeaccount")
	 WebElement pa;
	
	@FindBy(name="ammount")
	 WebElement at;
	
	
	@FindBy(name="desc")
	 WebElement  d;
	
	
	@FindBy(name="AccSubmit")
	WebElement s1;
	
 
	public void onClickFundTransfer() {
		
		driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");	
		
		}

		public void setF() throws IOException {
			
			 f.sendKeys(readExel(2,1,"account"));

		}
		
		
		public void setPa() throws IOException {
			
			pa.sendKeys(readExel(1,1,"deposit"));

		}
		
		public void setAt() throws IOException {
			
		
			at.sendKeys(readExel(1,1,"deposit"));
		}
			  
		
		public void setD() throws IOException {
			
			d.sendKeys(readExel(2,1,"deposit"));
		}
			  

    public void onClickS1() {
    	
			s1.click();
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
	
	
  

