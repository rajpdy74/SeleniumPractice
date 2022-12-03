package com.mercury.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.pages.LoginPage;
import com.mercury.utility.BrowserFactory;

public class LoginRegressionSuite {

	BrowserFactory browserFactory;
	LoginPage loginPage;
	WebDriver driver;
	
	@BeforeMethod
	public void browserAppLaunch() {
		driver = BrowserFactory.startBrowserApp("chrome", "http://newtours.demoaut.com/");
	}
	
	/*
	 * TC_001: Verifying valid login functionality
	 */
	@Test(priority = 0, enabled=true, description="TC_001: Verifying valid login functionality")
	public void verifyValidLogin() {
		try {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.userNameEntry("dasd"); // Entering valid User name.
		loginPage.passwordEntry("dasd"); // Entering valid Password.
		loginPage.clickLoginButton(); // Clicking on Login Button.
		Assert.assertEquals(true, loginPage.verifyValidLogin()); // Verifying valid login scenario.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	/*
	 * TC_002: Verifying invalid login functionality
	 */
	@Test(priority = 1, enabled=true, description="TC_002: Verifying invalid login functionality")
	public void verifyInvalidLogin() {
		try 
		{
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.userNameEntry("dasd123"); // Entering invalid User name.
		loginPage.passwordEntry("dasd123"); // Entering invalid Password.
		loginPage.clickLoginButton(); // Clicking on Login Button.
		Assert.assertEquals(true, loginPage.verifyInValidLogin()); // Verifying valid login scenario.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	/*
	 * TC_003: Verifying login data driven testing
	 */
	@Test(priority = 2, enabled=false, description="TC_003: Verifying login data driven testing")
	public void verifyDataDrivenLogin() {
		try 
		{
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.verifyValidLogin(); // Verifying valid login scenario.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}

