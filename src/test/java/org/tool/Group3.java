package org.tool;

import org.testng.annotations.Test;

public class Group3 {
	
	
	@Test(groups="regression")
	private void tc111() {
		System.out.println("test 111");

	}
	
	@Test(groups="smoke")
	private void tc222() {
		System.out.println("test 222");

	}
	@Test(groups="sanity")
	private void tc333() {
		System.out.println("test 333");

	}

}
