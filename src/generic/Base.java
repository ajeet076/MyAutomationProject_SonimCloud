package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pompages.LoginPage;

public class Base implements IcloudConstant {
	public WebDriver driver;

	
	static {
		System.setProperty(GECKO_KEY,GECKO_PATH);
		System.setProperty(CHROME_KEY, CHROME_PATH);
		}
	
	@BeforeMethod
	public void launchSonimCloud() {
		driver= new ChromeDriver();
		driver.get(Lib.getPropertyValue("URL"));
		
		
	}
	@AfterMethod
   public void closeSonimCloud(ITestResult res) {
		
		if(ITestResult.FAILURE==res.getStatus()) {
			Lib.captureScreenshot(driver, res.getName());
		}
		
		driver.close();
		
	}

	
}
