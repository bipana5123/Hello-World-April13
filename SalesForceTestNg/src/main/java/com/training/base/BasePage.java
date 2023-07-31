package com.training.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver= driver;
		
		//Page factory initialization
		PageFactory.initElements(driver, this);
		
	}
}
