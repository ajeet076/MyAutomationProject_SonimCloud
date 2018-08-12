package scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Base;
import generic.Lib;
import pompages.Dashboard;
import pompages.LoginPage;

public class testHome extends Base {
	
	@Test
	public void testDevices() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		
		lp.setUserName(username);
		
		lp.setPassword(password);
		lp.login();
	
		
		Dashboard d = new Dashboard(driver);
		
		/*if(d.isDevicePresent()) {
			System.out.println("Device is present.....................");
			
			
		}
		else {
			System.out.println("Device is Not present.....................");
			}
		
		if(d.isAppUpdaterDisplayed()) {
			
			Reporter.log("AppUpdater is present......", true);
		}
		else {
			Reporter.log("AppUpdater is NOT present......", true);
		}
		
		
		if(d.isEventsDisplayed()) {
			Reporter.log("Event is present......", true);
			
		}
		else {
			Reporter.log("Event is NOT present......", true);
		}
		if(d.isProvisioningDisplayed()) {
			Reporter.log("Provisioning is present......", true);
		}
		else {
			Reporter.log("Provisioning is NOT present......", true);
		}
		if(d.isSonimDMDisplayed()) {
			Reporter.log("Provisioning is present......", true);
		}
		else {
			Reporter.log("Provisioning is NOT present......", true);
		}*/
		
		 SoftAssert sa = new SoftAssert();
	     //sa.assertEquals(d.isDevicePresent(), true);
	     sa.assertEquals(d.isAppUpdaterDisplayed(), true,"appupdater........");
	     sa.assertEquals(d.isEventsDisplayed(), true,"events.................");
	     sa.assertEquals(d.isProvisioningDisplayed(), true,"provisioning.............");
	    // sa.assertEquals(d.isSonimDMDisplayed(),true,"sonimdm................");
	     sa.assertTrue(d.isSonimDMDisplayed()==true, "dm not dispalyed");
	    // sa.assertEquals(d.isDevicePresent(), true, "device element......."  );
	     sa.assertFalse(d.isDevicePresent()==false,"failkddddddddddddddd");
	    
	     
	     
	    
	    
	     sa.assertAll();
		
		/*d.clickDevices();
		
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(),"https://test.sonimcloud.com/device/index");
		sa.assertAll();
			*/
		
	
		
		
		
	}
	
	
	
	

}
