package com.accenture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void LoginValid() {
		
		String ER = "Tested";
		String AR = "Tested";
		Assert.assertEquals(AR, ER);
	}

	@Test
	public void LoginInvalid() {
		
		String ER = "Tested";
		String AR = "Tested123";
		Assert.assertEquals(AR, ER);
		
	}
}
