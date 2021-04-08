package org.tool;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=-7)
	private void tc1() {
		System.out.println("test 1");

	}
	
	@Test(priority=3,enabled=true,invocationCount=4)
	private void tc2() {
		System.out.println("test 2");
	}
	
	@Test
	private void tc3() {
		System.out.println("test 3");
	}
	
	@Test(priority=1)
	private void tc4() {
		System.out.println("test 4");
	}
	

}
