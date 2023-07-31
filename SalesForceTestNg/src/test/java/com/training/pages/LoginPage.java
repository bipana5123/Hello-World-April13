package com.training.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="Login")
	WebElement login;
	
	
	public void enterIntoEmail()
	{
		UserName.sendKeys("bip@company.bip");
	}
	public void enterIntoPassword()
	{
		Password.sendKeys("Company123");
	}
	public void clickonLogin()
	{
		login.click();
	}

}



