package scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Base;
import generic.Lib;
import pompages.LoginPage;

public class testCloudValidLogin extends Base {
	
	@Test(priority=1)
	public void testValidLogin()  {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		
		lp.setUserName(username);
		
		lp.setPassword(password);
		lp.login();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(),Lib.getPropertyValue("DASHBOARD"));
		sa.assertAll();//it will be use if we want to throw any exception
		
		
	}
	

}
