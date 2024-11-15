package com.vqa.testannotation;

import org.testng.annotations.Test;

public class AlphabeticalOrder {
  @Test
  public void f() {
	  System.out.println("F method is displayed");
  }
  
  @Test
  public void a() {
	  System.out.println("A method is displayed");
  }
  
  @Test
  public void g() {
	  System.out.println("G method is displayed");
  }
  
  @Test
  public void h() {
	  System.out.println("H method is displayed");
  }
  
  @Test
  public void z() {
	  System.out.println("Z method is displayed");
  }
}
