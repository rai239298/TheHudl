package com.qa.huld.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.huld.base.TestBase;
import com.qa.huld.pages.HomePage;
import com.qa.huld.pages.LandingPage;
import com.qa.huld.pages.LoginPage;
import com.qa.huld.pages.VideoPage;



public class LandingPageTest extends TestBase {
	
	LandingPage landingpage;
	LoginPage loginpage;
	HomePage homepage;
	VideoPage videopage;
	
	public LandingPageTest() {
		super();
	}
	
	
	
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		 landingpage = new LandingPage();
		 loginpage = new LoginPage();
		 homepage = new HomePage();
		 videopage = new VideoPage();
		
			
	}
	
	@Test 
	public void givenTest() throws InterruptedException {
		
	landingpage.clickOnSignBtn();
	loginpage.login(prop.getProperty("user_ID"), prop.getProperty("pwd"));
	homepage.clickOnVideo();
	videopage.checkingCheckbox();
	videopage.unCheckingCheckbox();
	videopage.clickOnUserName();
	videopage.clickOnLogOut();
	
		  
	}
	

	
	@AfterMethod
	public void tearDown(){        
		driver.quit();
	}
	

}
