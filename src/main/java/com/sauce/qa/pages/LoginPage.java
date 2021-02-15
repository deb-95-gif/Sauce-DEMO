package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath ="//input[@name='user-name']")
	WebElement username;
	
	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	//Intializing the page Objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un , String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
