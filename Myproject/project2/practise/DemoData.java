package practise;

import org.testng.annotations.Test;

import generics.ExcelUtility;

public class DemoData {
	@Test(dataProvider="testdata",dataProviderClass=ExcelUtility.class)

	public void demo(String data) {
		System.out.println(data);
	}

}
