package org.tool;

import org.testng.annotations.Test;

public class Suite2 {
	
	@Test(dataProvider="sampledata",dataProviderClass=Suite1.class)
	private void test2(String mail, String pass) {
		System.out.println(mail);
		System.out.println(pass);
		System.out.println("done.......");
	}
	

}
