// package com.mercury.test;

// public class FlightFinderRegressionSuite {

// }

package com.mercury.gradle.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightFinderRegressionSuite {
	
	WebDriver driver;
	MethodRepository mr = new MethodRepository();
	
	@BeforeMethod
	public void appLaunch() throws InterruptedException
	{
		mr.browserAppLaunch();
	}
	
	/*
	 * TC_001: Verifying default selection of flight type.
	 */
	@Test(priority = 0, enabled=true, description="TC_001: Verifying default selection of flight type.")
	public void verifyDefaultSelectionFlightType() {
		try {
			mr.login("dasd", "dasd");
			Assert.assertEquals(true, mr.verifyDefaultSelectionRoundTrip());
		}
		catch(Exception e) {
			System.out.println(e);
			}
		}
	
	/*
	 * TC_002: Verifying departing from desired value selection.
	 */
	@Test(priority = 1, enabled=true, description="TC_002: Verifying departing from desired value selection.")
	public void verifyDepartingFromValueSelection() {
		try {
			mr.login("dasd", "dasd");
			Assert.assertEquals(true, mr.departingFromValueSelection());
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	/*
	 * TC_003: Verifying Arriving In  value selection.
	 */
	@Test(priority = 2, enabled=true, description="TC_003: Verifying Arriving In value selection.")
	public void arrivingInValueSelection() {
		try {
			mr.login("dasd" , "dasd");
			Assert.assertEquals(true, mr.arrivingInValueSelection());
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	/*
	 * TC_004: Verifying Airlines value selection.
	 */
	@Test(priority = 3, enabled=true, description="TC_004: Verifying Airlines value selection.")
	public void airlinesValueSelection() {
		try {
			mr.login("dasd" , "dasd");
			Assert.assertEquals(true, mr.airlinesValueSelection());
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	@AfterMethod
	public void closeApp() {
		mr.appClose();
	}

}
