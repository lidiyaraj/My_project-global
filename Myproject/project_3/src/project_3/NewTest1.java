package project_3;

import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class NewTest1 {
  @Test
  public void f2() {
	  System.out.println("inside f2()");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside afterSuite");
  }

}
