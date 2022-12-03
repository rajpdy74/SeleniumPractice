package com.mercury.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {
	
	public static void waitForElement(WebElement element, Duration i, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
public static void waitTill(int waitTime) {
		try {
			Thread.sleep(waitTime);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
