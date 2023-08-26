package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generics.ExcelUtility;

public class ex {
	@Test(dataProvider="testdata",dataProviderClass = ExcelUtility.class)
	public void demo(String Organizationname,String Employeenumber,String phonenumber)
	{
		System.out.println(Organizationname);
	}
	

}
