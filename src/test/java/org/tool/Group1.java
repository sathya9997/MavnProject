package org.tool;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("test 1");

	}
	
	@Test(groups="sanity")
	private void tc2() {
		System.out.println("test 2");

	}
	@Test(groups="regression")
	private void tc3() {
		System.out.println("test 3");

	}

}
