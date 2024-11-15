package com.vqa.testannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingFlowAssertion {
	
	@Test (priority = 1)
	public void launchApplication() {
		System.out.println("Application is launched successfully");
		Assert.assertEquals("Page title", "Page title","Page title is different");
	}
	
	@Test (priority = 2)
	public void loginApplication() {
		System.out.println("Logged in successfully");
		Assert.assertEquals("Login", "Login","Invalid login");
	}
	
	@Test (priority = 3)
	public void checkSavingsAccountBalance() {
		System.out.println("Savings Account balanace is checked");
		Assert.assertEquals("Savings Account", "Savings Account","Savings Account is not validated");
	}
	
	@Test (priority = 4)
	public void checkCurrentAccountBalance() {
		System.out.println("Current Account balanace is checked");
		Assert.assertEquals("Current Account", "Current Account","Current Account is not validated");
	}
	
	@Test (priority = 5)
	public void logoutApplication() {
		System.out.println("Logged out successfully");
		Assert.assertEquals("Logout", "Logout","Logout failed");
	}
	
	@Test (priority = 6)
	public void closeApplication() {
		System.out.println("Application is closed successfully");
		Assert.assertEquals("Close", "Close","Unable to close the application");
	}

}
