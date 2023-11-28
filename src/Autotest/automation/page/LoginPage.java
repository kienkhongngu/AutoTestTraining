package autotest.page;
import autotest.constant.CT_Account;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public void LoginFunction(String emailX, String passX) {
		WebElement email = driver.findElement(CT_Account.TEXT_EMAIL);
		if(email.isEnabled()) {
			email.clear();
			email.sendKeys(emailX);
		}
		WebElement pass = driver.findElement(CT_Account.TEXT_PASSWORD);
		if(pass.isEnabled()) {
			pass.clear();
			pass.sendKeys(passX);
		}
		WebElement bt = driver.findElement(CT_Account.TEXT_BUTTON);
		if(bt.isEnabled()) {
			bt.click();
		}
	}
	public void LogoutFunction() {
		WebElement user = driver.findElement(CT_Account.TEXT_USER);
		if(user.isEnabled()) {
			user.click();
		}
		 WebElement logoutButton = driver.findElement(CT_Account.TEXT_BUTTONLOGOUT);
	        if (logoutButton.isEnabled()) {
	            logoutButton.click();
	        }

	}
		
	
	
}
