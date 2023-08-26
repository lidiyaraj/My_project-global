package package1;

import org.testng.annotations.Test;

public class TestGroup {
  @Test(groups="Software")
  public void f() {
	  System.out.println("inside f()");
  }
  @Test(groups="Software")
  public void A() {
	  System.out.println("inside A()");
  }
  @Test 
  public void B() {
	  System.out.println("inside B()");
  }
}
