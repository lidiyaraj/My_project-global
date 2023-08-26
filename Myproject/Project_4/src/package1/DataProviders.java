package package1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("the elements are:"+n+","+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{ 101,"oshin"},
    	{ 123,"manu"},
    	{ 567,"sonu"}
    };
  }
}
