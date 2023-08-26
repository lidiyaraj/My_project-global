package package1;

import org.testng.annotations.Test;

public class Timeout {
  @Test (timeOut=500)
  public void testcase1() throws Throwable {
	  Thread.sleep(200);
	  System.out.println("this is testcase1");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("this is testcase2");
  }
}
