package com.accenture.test;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.Registration;
import com.accenture.utilities.ExcelUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
	
	WebDriver d;
	HomePage h;
	Registration r;
	ExcelUtility e;
  @Test
  public void TestRegistration() throws IOException {
	  
	  h.clickRegistration();
	  e.getTestData();
	//  d.findElement(By.linkText("Log out")).click();
	  //h.clickRegistration();
	  //e.getTestData();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("http://demowebshop.tricentis.com/register");
	//  h = new HomePage();
	  h = PageFactory.initElements(d, HomePage.class);
	  r = PageFactory.initElements(d, Registration.class);
	  e = new ExcelUtility();
	  
  }

}
