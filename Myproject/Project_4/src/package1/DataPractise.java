package package1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataPractise {
  @Test(dataProvider = "dp")
  public void login(String s1, String s2) {
	  System.out.println("the username and password are:"+s1+","+s2);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{"abc@gmail.com","manglore"},
    	{"xyz@gmail.com","banglore"}
    };
  }
}
