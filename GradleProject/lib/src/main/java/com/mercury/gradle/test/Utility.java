//  package com.mercury.test;

//  public class Utility {

// 	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	}
//  }


package com.mercury.gradle.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
public static void waitForElement(WebElement element, Duration waitTime, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
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

