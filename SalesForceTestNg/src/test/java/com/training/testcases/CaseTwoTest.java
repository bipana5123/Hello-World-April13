package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.CaseTwoPage;

public class CaseTwoTest extends BaseTest
{
	WebDriver driver;
	CaseTwoPage casetwopage;
	
	@BeforeMethod
	public void beforemethod()
	{
		driver=getDriver();
		driver.get("https://login.salesforce.com/");
		casetwopage = new CaseTwoPage(driver);
		
		
	}
	@Test
	public void loginintoSaleforce()
	{
		casetwopage.enterIntoEmail();
		casetwopage.enterIntoPassword();
		casetwopage.clickonLogin();
	}
	
	

}
