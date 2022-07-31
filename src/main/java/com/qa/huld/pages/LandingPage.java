package com.qa.huld.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.huld.base.TestBase;

public class LandingPage extends TestBase {
	
	
	
	//Page Factory - OR ( Object Repository )
	
	@FindBy (xpath ="//a[text()='Log in']")
	WebElement loginBtn;
	
	
	public LandingPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public LoginPage clickOnSignBtn() {
		loginBtn.click();
		return new LoginPage();
		
	}
	
	
	

}
