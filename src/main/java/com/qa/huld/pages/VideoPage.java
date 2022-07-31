package com.qa.huld.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.huld.base.TestBase;
import com.qa.huld.util.TestUtil;

public class VideoPage extends TestBase{
	
	
	
	
	//Page Factory - OR ( Object Repository )
	
	@FindBy(xpath="//span[normalize-space()='For Testing']/preceding-sibling::div")
	WebElement checkbox;
	
	@FindBy(css=".hui-globaluseritem")
	WebElement userNameIcon;
	
	
	@FindBy(xpath="(//*[contains(text(),'Log Out')])[2]")
	WebElement logOut;
	

	
	
	
	
	
	public VideoPage() {
		PageFactory.initElements(driver,this);	
	}
	
	public void checkingCheckbox() {
		
		checkbox.click();
	}
	public void unCheckingCheckbox()  {
		
		checkbox.click();
	}
	
	public void clickOnUserName()  {
	
		userNameIcon.click();
	}
	public void clickOnLogOut() throws InterruptedException {
		logOut.click();
	}
	
	
	
	

}
