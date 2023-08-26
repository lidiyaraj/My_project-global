package package1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {
  @Test
  @Parameters({"a","b"})
  public void sum(int c,int d) {
	  int sum=c+d;
	  System.out.println("sum of two numbers:"+sum);
  }
}
