package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rDriver)
	{
		ldriver= rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement login;
	
	public void enterUsername(String UserName)
	{
		username.sendKeys(UserName);
		//bip@company.bip
	}
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void enterLogin()
	{
		login.click();
	}
	
}
