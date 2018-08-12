package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	@FindBy(xpath="//p[text()='Devices']")
	WebElement devicesBtn;
	
	@FindBy(xpath="//p[text()='App Updater']")
	WebElement appUpdaterBtn;
	
	@FindBy(xpath="//p[text()='Provisioning']")
	WebElement provisioningBtn;
	
	@FindBy(xpath="//p[text()='Sonim DM']")
	WebElement sonimDMBtn;
	
	@FindBy(xpath="//p[text()='Events']")
	WebElement eventsBtn;
	
	
	public  Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickDevices() {
		
		devicesBtn.click();
	}
	public  boolean isDevicePresent() {
		return devicesBtn.isDisplayed();
		
	}
	
	public boolean isAppUpdaterDisplayed() {
		return appUpdaterBtn.isDisplayed();
		
		
		}
	public boolean isProvisioningDisplayed() {
		
		return provisioningBtn.isDisplayed();
		
		
		
	}
	
	public boolean isSonimDMDisplayed() {
		return sonimDMBtn.isDisplayed();
		
		
	}
	
	public boolean isEventsDisplayed() {
		return eventsBtn.isDisplayed();
		
		
	}
	
	

}
