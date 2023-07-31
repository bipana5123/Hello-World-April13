package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.CaseOnePage;

public class CaseOneTest extends BaseTest

{
	WebDriver driver;
	CaseOnePage caseoneloginpage;
	
	@BeforeMethod
	public void beforemethod()
	{
		driver= getDriver();
		driver.get("https://login.salesforce.com/");
		caseoneloginpage = new CaseOnePage(driver);
		
	}
	@Test
	public void loginintoApplicationcaseOne()
	{
		caseoneloginpage.enterUserName();
		caseoneloginpage.clearPassword();
		caseoneloginpage.clickonLogin();
		
	}
	
	

}
