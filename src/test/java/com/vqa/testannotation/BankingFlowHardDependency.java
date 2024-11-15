package com.vqa.testannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingFlowHardDependency {
	
	@Test 
	public void launchApplication() {
		System.out.println("Application is launched successfully");
		Assert.assertEquals("Page title", "Page title","Page title is different");
	}
	
	@Test (dependsOnMethods = {"launchApplication"})
	public void loginApplication() {
		System.out.println("Logged in successfully");
		Assert.assertEquals("Login", "Login","Invalid login");
	}
	
	@Test (dependsOnMethods = {"loginApplication"})
	public void checkSavingsAccountBalance() {
		System.out.println("Savings Account balanace is checked");
		Assert.assertEquals("Not Savings Account", "Savings Account","Savings Account is not validated");
	}
	
	@Test (dependsOnMethods = {"checkSavingsAccountBalance"})
	public void checkCurrentAccountBalance() {
		System.out.println("Current Account balanace is checked");
		Assert.assertEquals("Current Account", "Current Account","Current Account is not validated");
	}
	
	@Test (dependsOnMethods = {"checkCurrentAccountBalance"})
	public void logoutApplication() {
		System.out.println("Logged out successfully");
		Assert.assertEquals("Logout", "Logout","Logout failed");
	}
	
	@Test (dependsOnMethods = {"logoutApplication"})
	public void closeApplication() {
		System.out.println("Application is closed successfully");
		Assert.assertEquals("Close", "Close","Unable to close the application");
	}

}
