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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightPage {	
	WebDriver driver;
	
	
	public FlightPage(WebDriver driver) {
		
		this.driver=driver;
	}
 
	@FindBy(how=How.NAME,using="tripType")
	WebElement type;
	
	
	@FindBy(name="passCount")
	WebElement passenger;
	
	
	@FindBy(name="fromPort")
	WebElement departure;
	
	
	@FindBy(name="fromMonth")
	WebElement month;
	
	
	@FindBy(name="fromDay")
	WebElement day;
	
	
	@FindBy(name="toPort")
	WebElement arrival;
	
	
	@FindBy(name="toMonth")
	WebElement returnmonth;
	
	
	@FindBy(name="toDay")
	WebElement returndate;
	
	@FindBy(xpath = "//table/tbody/tr[9]/td[2]/font/input")
	WebElement eclass;
	
	
	@FindBy(xpath="//table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement bclass1;
	
	@FindBy(xpath="//table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement first;
	
	@FindBy(name="airline")
	WebElement airlines;
	
	@FindBy(name="findFlights")
	WebElement con;
	


public void onClickFlight() {
	
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
}

public void onClickType(){
	
	type.click();
	
} 

public void setPassenger() {
	Select p=new Select(passenger);
	p.selectByVisibleText("2");

}

public void setDeparture() {
	Select d=new Select(departure);
	d.selectByVisibleText("London");

}


public void setMonth() {
	Select m=new Select(month);
	m.selectByVisibleText("May");


}


public void setDay() {
	Select d=new Select(day);
	d.selectByVisibleText("12");


}


public void setArrival() {
	Select a=new Select(arrival);
	a.selectByVisibleText("Paris");


}


public void setReturn() {
	Select r=new Select(returnmonth);
	r.selectByVisibleText("August");


}


public void setDate() {
	Select rn=new Select(returndate);
	rn.selectByVisibleText("20");


}


public void setService(String serviceclass) throws IOException, Throwable{
	String a=eclass.getAttribute("value");
	if(a.equalsIgnoreCase(serviceclass))
	{
		
		eclass.click();
		eclass.sendKeys(Keys.TAB);
		System.out.println(eclass);
		
	}
	
	String b=bclass1.getAttribute("value");
	if(b.equalsIgnoreCase(serviceclass));
	{
		Actions builder=new Actions(driver);
		builder.moveToElement(bclass1).click().build().perform();
		bclass1.sendKeys(Keys.TAB);
		System.out.println(bclass1);
	}
	
	String c=first.getAttribute("value");
	if(c.equalsIgnoreCase(serviceclass))
	{
		first.click();
		first.sendKeys(Keys.TAB);
		System.out.println(first);
	}
	Thread.sleep(5000);
}


public void setAirlines() {
	Select al=new Select(airlines);
	al.selectByVisibleText("Unified Airlines");

}


public void onClickCon() {
	con.click();
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



