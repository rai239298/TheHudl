package com.qa.huld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.huld.base.TestBase;

public class HomePage extends TestBase {
	
	

	//Page Factory - OR ( Object Repository )
	
	@FindBy(xpath=" //span[normalize-space()='Video']")
	WebElement video;
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public VideoPage clickOnVideo() {
		
	   video.click();
	   return new VideoPage();
	}

}
