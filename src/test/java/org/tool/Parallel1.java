package org.tool;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parallel1 {
	
	@Test
	 private void tc1() {
		System.out.println("test 1");
	}
	@Test
	 private void tc2() {
		System.out.println("test 2");
		SoftAssert s = new SoftAssert();
		Assert.assertTrue(false);
		System.out.println("3");
		System.out.println("4");
		s.assertAll();
		System.out.println("5");
		System.out.println("6");
		
	}
	@Test
	 private void tc3() {
		System.out.println("test 3");
	}
}
