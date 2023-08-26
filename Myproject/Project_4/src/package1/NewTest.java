package package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("inside f()");
  }
  @Test
  public void a() {
	  System.out.println("abcd");
  }
  @BeforeMethod
  public void beforeSuite() {
	  System.out.println("inside beforemethod");
  }

  @AfterMethod
  public void afterSuite() {
	  System.out.println("inside aftermethod");
  }

}
