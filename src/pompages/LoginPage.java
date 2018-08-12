package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	WebElement unTB;
	
	@FindBy(name="password")
	WebElement pwdTB;
	
	@FindBy(id="submitbutton")
	WebElement loginBTN;
	//dashboard
	@FindBy(xpath="//p[text()='Devices']")
	WebElement devicesTB;
	

     public  LoginPage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
    	 
     }
     public void setUserName(String un) {
    	 unTB.sendKeys(un);
    	 
     }
     public void setPassword(String pwd) {
    	 pwdTB.sendKeys(pwd);
    	 
     }
     public void login() {
    	 loginBTN.click();
     }
     public boolean clickDevices() {
 		
 		devicesTB.click();
		return false;
 	}
     }



