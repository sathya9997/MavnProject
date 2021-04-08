package org.tool;

import org.testng.annotations.Test;

public class Group2 {
	
	
	@Test(groups="sanity")
	private void tc11() {
		System.out.println("test 11");

	}
	
	@Test(groups="smoke")
	private void tc22() {
		System.out.println("test 22");

	}
	@Test(groups="rerun")
	private void tc33() {
		System.out.println("test 33");

	}

}
