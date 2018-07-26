package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	
	WebDriver d;
	static
	@FindBy(id="gender-female")
	WebElement ChkBox_Gender;
	
	static
	@FindBy(id="FirstName")
	WebElement TxtBox_FirstName;
	
	static
	@FindBy(id="LastName")
	WebElement TxtBox_LastName;
	
	static
	@FindBy(id="Email")
	WebElement TxtBox_Email;
	
	static
	@FindBy(id="Password")
	WebElement TxtBox_Password;
	
	static
	@FindBy(id="ConfirmPassword")
	WebElement TxtBox_ConfirmPassword;
	
	static
	@FindBy(id="register-button")
	WebElement Btn_Register;
	
	public static void registration(String F,String L, String E, String P, String CP)
	{
		ChkBox_Gender.click();
		TxtBox_FirstName.sendKeys(F);
		TxtBox_LastName.sendKeys(L);
		TxtBox_Email.sendKeys(E);
		TxtBox_Password.sendKeys(P);
		TxtBox_ConfirmPassword.sendKeys(CP);
		Btn_Register.click();
	}
	
	public Registration(WebDriver driver)
	{
		this.d=driver;
	}
}
