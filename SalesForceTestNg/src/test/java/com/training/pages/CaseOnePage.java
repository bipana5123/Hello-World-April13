package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class CaseOnePage extends BasePage
{
	public CaseOnePage(WebDriver driver) {
		super(driver);
			
	}
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="Login")
	WebElement login;
	
	public void enterUserName()
	{
		UserName.sendKeys("bip@company.bip");
	}
	public void clearPassword()
	{
		Password.sendKeys(" ");
	}
	public void clickonLogin()
	{
		login.click();
	}

}
