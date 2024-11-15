package com.vqa.methodclassannotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
	
	@BeforeMethod  
	public void loginApplication() {
		System.out.println("Logged in successfully");		
	}
	
	@AfterMethod
	public void closeApplication() {		
		System.out.println("Application is closed successfully");		
	}
	
	@Test (priority = 1)
	public void navigateToRegistrationForm() {		
		System.out.println("Registration Form is displayed");		
	}
	
	@Test (priority = 2)
	public void navigateToAlertPopupPage() {		
		System.out.println("Alert and Popup page is displayed successfully");		
	}
	
	@Test (priority = 3)	
	public void navigateToWebTable() {		
		System.out.println("WebTable page is displayed successfully");		
	}
	
	@Test (priority = 4)
	public void navigateToMultipleWindows() {		
		System.out.println("Multiple Windows page is displayed successfully");		
	}
}