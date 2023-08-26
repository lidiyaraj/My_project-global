package listernersp;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseClass;
import generics.ListenerImplementation;

//@Listeners(ListenerImplementation.class)
public class TC01 extends BaseClass {
	
	@Test

	public void demo() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("testcase");
		assertEquals(false,true);


	} 
	

}
