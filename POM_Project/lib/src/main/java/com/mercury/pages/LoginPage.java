package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.utility.WaitElement;

	public class LoginPage {
			
			/* Global declaration of WebDriver Object */
			WebDriver driver;
			WebElement waitelement;
			
	//		FileReading fileReading;
			
			/* Object identification block */
			@FindBy(xpath="//input[@name='userName']")
			WebElement txtBoxUserName;
			
			@FindBy(xpath="//input[@name='password']")
			WebElement txtBoxPassword;
			
			@FindBy(xpath="//input[@value='Login']")
			WebElement btnLogin;
			
			/* Constructor definition */ 
			public LoginPage(WebDriver driver)
			{
				this.driver = driver;
			}
			
			/* Method to enter User name */
			public void userNameEntry(String userName)
			{
				WaitElement.waitForElement(txtBoxUserName, 30, driver);
				txtBoxUserName.sendKeys(userName);
			}
			
			/* Method to enter password */
			public void passwordEntry(String password)
			{
				WaitElement.waitForElement(txtBoxPassword, 30, driver);
				txtBoxPassword.sendKeys("dasd");
			}
			
			/* Method to click on login button */
			public FlightFinderPage clickLoginButton()
			{
				WaitElement.waitForElement(btnLogin, 50, driver);
				btnLogin.click();
				WaitElement.waitTill(5000);
				return PageFactory.initElements(driver, FlightFinderPage.class);
			}
			
			/* Verifying valid login */
			public boolean verifyValidLogin()
			{		
				String expTitle = "Find a Flight: Mercury Tours:";
				String actTitle = driver.getTitle();
				
				if(expTitle.equals(actTitle)) {
					return true;
				}else {
					return false;
				}
				
			}
			
			/* Verifying invalid login */
			public boolean verifyInValidLogin()
			{
				String expTitle = "Find a Flight: Mercury Tours:";
				String actTitle = driver.getTitle();
				
				if(expTitle!=(actTitle)) {
					return true;
				}else {
					return false;
				}
				
			}
				
	}			
				
				
					
			
					
					

				
					
