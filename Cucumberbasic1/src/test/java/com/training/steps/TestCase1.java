package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 
{
    public WebDriver driver;
    
    public LoginPage loginPg;
	
    @Given("User launch the SalesForce application")
    public void user_launch_the_sales_force_application(String url) {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        driver.get("https://login.salesforce.com/");
       
    }

    @When("user enter the valid username")
    public void user_enter_the_valid_username(String username) {

    loginPg.enterUsername("bip@company.bip");
    
    
    	
    }

    @When("clear the password")
    public void clear_the_password(String password) {
    loginPg.enterPassword(" ");
    
    }

    @Then("Login")
    public void login() {
    loginPg.enterLogin();
    }

    
}

