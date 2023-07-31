package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;

public class LoginTest extends BaseTest
{
	WebDriver driver;
	LoginPage loginpage;
	
	
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		driver.get("https://login.salesforce.com/");
		loginpage = new LoginPage(driver);
	}
	
	@Test
	public void loginintoApplication()
	{
		loginpage.enterIntoEmail();
		loginpage.enterIntoPassword();
		loginpage.clickonLogin();
		
		
	}

}
