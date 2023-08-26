package package1;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test5Before {
	@BeforeGroups("IT")
  @Test
  public void f() {
		System.out.println("inside f()");
  }
	@Test(groups= {"IT"})
	public void f1() {
		System.out.println("inside f1()");
	}
	@Test(groups= {"IT"})
	public void f5() {
		System.out.println("inside f5()");
	}
	@AfterGroups("IT")
	public void f3() {
		System.out.println("inside f3()");
	}
}
