package project_3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class Guru99 {
	WebDriver driver;
 
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "./driver3/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
	     driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
  }

 // @AfterSuite
  public void afterSuite() {
	  driver.quit();
	  
  }
  @Test
  public void login() throws IOException {
	  WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys(readExel(1,0,"login"));
		//System.out.println(username.isDisplayed());
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(readExel(1,1,"login"));
		
		WebElement login=driver.findElement(By.name("btnLogin"));
		
		login.click();
		writeExel(1,2,"success","login");
		//System.out.println(login.isSelected());
		
  }
  @Test(dependsOnMethods = {"login"})
  public void addCustomer() throws IOException, Throwable {
	//  WebElement a=driver.findElement(By.linkText("New Customer"));
		//a.click();
	  driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
		
	  WebElement customer=driver.findElement(By.name("name"));
	  customer.sendKeys(readExel(0,1,"addCustomer"));
	  
	  WebElement gender=driver.findElement(By.name("rad1"));
	  gender.click();
	  System.out.println(gender.isSelected());
	  
	  WebElement dob=driver.findElement(By.id("dob"));
	  dob.sendKeys(readExel(1,1,"addCustomer"));
	  
	  WebElement address=driver.findElement(By.name("addr"));
	  address.sendKeys(readExel(2,1,"addCustomer"));
	  
	  WebElement city=driver.findElement(By.name("city"));
	  city.sendKeys(readExel(3,1,"addCustomer"));
	  
	  WebElement state=driver.findElement(By.name("state"));
	  state.sendKeys(readExel(4,1,"addCustomer"));
	  
	  WebElement pin=driver.findElement(By.name("pinno"));
	  pin.sendKeys(readExel(5,1,"addCustomer"));
	  
	  WebElement mob=driver.findElement(By.name("telephoneno"));
	  mob.sendKeys(readExel(6,1,"addCustomer"));
	  
	  WebElement email=driver.findElement(By.name("emailid"));
	  email.sendKeys(readExel(7,1,"addCustomer"));
	  
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys(readExel(8,1,"addCustomer"));
	  
	  WebElement submit=driver.findElement(By.name("sub"));
	  submit.click();
	  
	  Thread.sleep(5000);
	  WebDriverWait wait=new WebDriverWait(driver,50/*timeout in seconds*/);
	  try
	  {
		wait.until(ExpectedConditions.invisibilityOf(submit)) ;
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer")));
		
		WebElement customerid_textfield=driver.findElement(By.xpath("//table[@id=\"customer\"]/tbody/tr[4]/td[2]"));
		
		String cust_id1=customerid_textfield.getText();
		writeExel(0,1,cust_id1,"account");
	  }
	  catch(Exception e)
	  {
		  driver.navigate().refresh();
	  }
	//  writeExel(1,2,"success","cust_detail");
	  

	  
	  
  }
    @Test(dependsOnMethods = {"addCustomer"})
                    public void account() throws IOException, Throwable{
  
 // WebElement a2=driver.findElement(By.linkText("New Account"));
 // a2.click();
	  
	  driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
  
  WebElement cust_id=driver.findElement(By.name("cusid"));
  cust_id.sendKeys(readExel(0,1,"account"));
  
  WebElement account_type=driver.findElement(By.name("selaccount"));
  Select account1=new Select(account_type);
  account1.selectByValue("Current");
  
  WebElement initial_deposit=driver.findElement(By.name("inideposit"));
  initial_deposit.sendKeys(readExel(1,1,"account"));
  
  WebElement sub=driver.findElement(By.name("button2"));
  sub.click();
  
  Thread.sleep(5000);
  WebDriverWait wait=new WebDriverWait(driver,50/*timeout in seconds*/);
  try
  {
	wait.until(ExpectedConditions.invisibilityOf(sub));
	driver.switchTo().defaultContent();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account")));
	
	WebElement accountid_textfield=driver.findElement(By.xpath("//table[@id=\"account\"]/tbody/tr[4]/td[2]"));
	
	String acc_id1=accountid_textfield.getText();
	writeExel(2,1,acc_id1,"account");
  }
  catch(Exception e)
  {
	  driver.navigate().refresh();
  }
//  writeExel(1,2,"success","cust_detai
  
  
  
   
  }	
 @Test(dependsOnMethods = {"account"})
  public void deposit() throws IOException, Throwable {
	  
	  driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
	  
	  WebElement ac_no=driver.findElement(By.name("accountno"));
	  ac_no.sendKeys(readExel(2,1,"account"));
	  
	  WebElement amount=driver.findElement(By.name("ammount"));
	  amount.sendKeys(readExel(1,1,"deposit"));
	  
	  WebElement description=driver.findElement(By.name("desc"));
	  description.sendKeys(readExel(2,1,"deposit"));
	  
	  WebElement Acc =driver.findElement(By.name("AccSubmit"));
	 Acc.click();	 
	 }
	 	  	  
  
  
 // @Test(dependsOnMethods = {"deposit"})
  public void withdrawal() throws IOException {
	  driver.get("http://www.demo.guru99.com/V4/manager/WithdrawalInput.php");
	  
	  WebElement amd_withdraw=driver.findElement(By.name("accountno"));
	  amd_withdraw.sendKeys(readExel(2,1,"account"));
	  
	  WebElement amd=driver.findElement(By.name("ammount"));
	  amd.sendKeys(readExel(1,1,"deposit"));
	  
	  WebElement d=driver.findElement(By.name("desc"));
	  d.sendKeys(readExel(2,1,"deposit"));
	  
	 WebElement s=driver.findElement(By.name("AccSubmit"));
	 s.click();
	 }
 // @Test(dependsOnMethods = {"addCustomer"} )
  public void editcustomer() throws IOException {
	  
	  driver.get("http://www.demo.guru99.com/V4/manager/EditCustomer.php");
	  
	  WebElement e=driver.findElement(By.name("cusid"));
	  e.sendKeys(readExel(0,1,"account"));
	  
	  WebElement st=driver.findElement(By.name("AccSubmit"));
	  st.click();
  }
 // @Test(dependsOnMethods = {"account"} )
  public void editaccount() throws IOException {
	  
	  driver.get("http://www.demo.guru99.com/V4/manager/editAccount.php");
	  
	  WebElement ea=driver.findElement(By.name("accountno"));
	  ea.sendKeys(readExel(2,1,"account"));
	  
	  WebElement sb=driver.findElement(By.name("AccSubmit"));
	  sb.click();
  }
 // @Test(dependsOnMethods = {"addCustomer"})
  public void deletecustomer() throws IOException {
	  driver.get("http://www.demo.guru99.com/V4/manager/DeleteCustomerInput.php");
	  
	  WebElement cu=driver.findElement(By.name("cusid"));
	  cu.sendKeys(readExel(0,1,"account"));
	  
	  WebElement su=driver.findElement(By.name("AccSubmit"));
	  su.click();
  }
  
 //@Test(dependsOnMethods = {"account"})
  public void deleteaccount() throws IOException {
	  driver.get("http://www.demo.guru99.com/V4/manager/deleteAccountInput.php");
	  
	  WebElement a=driver.findElement(By.name("accountno"));
	  a.sendKeys(readExel(2,1,"account"));
	  
	  WebElement b=driver.findElement(By.name("AccSubmit"));
	  b.click();
  }
  
// @Test(dependsOnMethods = {"account"})
  public void fundtransfer() throws IOException {
	  driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
	  
	  WebElement f=driver.findElement(By.name("payersaccount"));
	  f.sendKeys(readExel(2,1,"account"));
	  
	  WebElement pa=driver.findElement(By.name("payeeaccount"));
	  pa.sendKeys(readExel(1,1,"deposit"));
	  
	  WebElement at=driver.findElement(By.name("ammount"));
	  at.sendKeys(readExel(1,1,"deposit"));
	  
	  WebElement d=driver.findElement(By.name("desc"));
	  d.sendKeys(readExel(2,1,"deposit"));
	  
	  WebElement s1=driver.findElement(By.name("AccSubmit"));
	  s1.click();
  }
//  @Test(dependsOnMethods = {"login"})
  public void changepassword() throws IOException {
	  WebElement old=driver.findElement(By.name("oldpassword"));
	  old.sendKeys(readExel(1,1,"login"));
	  
	  WebElement np=driver.findElement(By.name("newpassword"));
	  np.sendKeys("kjytrs");
	  
	  WebElement cp=driver.findElement(By.name("confirmpassword"));
	  cp.sendKeys("kjytrs");
	  
	  WebElement s2=driver.findElement(By.name("sub"));
	  s2.click();
  }
  
 // @Test(dependsOnMethods = {"account"})
  public void balanceenquiry() throws IOException {
	  
	  driver.get("http://www.demo.guru99.com/V4/manager/BalEnqInput.php");
	  
	  WebElement be=driver.findElement(By.name("accountno"));
	  be.sendKeys(readExel(2,1,"account"));
	  
	  WebElement s4=driver.findElement(By.name("AccSubmit"));
	  s4.click();
  }
 // @Test(dependsOnMethods = {"account"})
  public void ministatement() throws IOException {
	  driver.get("http://www.demo.guru99.com/V4/manager/MiniStatementInput.php");
	  
	  WebElement ms=driver.findElement(By.name("accountno"));
	  ms.sendKeys(readExel(2,1,"account"));
	  
	  WebElement s6=driver.findElement(By.name("AccSubmit"));
	  s6.click();
  }
  @Test(dependsOnMethods = {"deposit"})
  public void customizedstatement() throws IOException {
	  
	  driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
	  
	  WebElement an=driver.findElement(By.name("accountno"));
	  an.sendKeys(readExel(2,1,"account"));
	  
	  WebElement fdate=driver.findElement(By.name("fdate"));
	  fdate.sendKeys("16/04/2019");
	  
	  WebElement tdate=driver.findElement(By.name("tdate"));
	  tdate.sendKeys("29/01/2020");
	  
	  WebElement mt=driver.findElement(By.name("amountlowerlimit"));
	  mt.sendKeys("1000");
	  
	  WebElement nt=driver.findElement(By.name("numtransaction"));
	  nt.sendKeys("5");
	  
	  WebElement cs=driver.findElement(By.name("AccSubmit"));
	  cs.click();
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

