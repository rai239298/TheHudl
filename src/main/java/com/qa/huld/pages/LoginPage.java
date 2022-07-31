package com.qa.huld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.huld.base.TestBase;

public class LoginPage extends TestBase {
	
	
	//Page Factory - OR ( Object Repository )
	
	@FindBy(id="email")
	WebElement userId;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="logIn")
	WebElement loginBtn;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public HomePage login(String uname,String pwd) {
		userId.clear();
		userId.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	

}
