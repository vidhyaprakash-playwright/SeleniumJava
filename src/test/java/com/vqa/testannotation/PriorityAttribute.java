package com.vqa.testannotation;

import org.testng.annotations.Test;

public class PriorityAttribute {
	
	@Test (priority = 1)
	public void launchApplication() {
		System.out.println("Application is launched successfully");
	}

	@Test (priority = 2)
	public void navigateToDemoSite() {
		System.out.println("Demo Site is displayed successfully");
	}

	@Test (priority = 3)
	public void registerDemo() {
		System.out.println("User is registered successfully");
	}

	@Test (priority = 4)
	public void validateSuccessMessage() {
		System.out.println("Success Message is validated successfully");
	}

	@Test (priority = 5)
	public void closeApplication() {
		System.out.println("Application is closed successfully");
	}

}