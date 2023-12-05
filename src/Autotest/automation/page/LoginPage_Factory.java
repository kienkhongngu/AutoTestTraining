package autotest.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage_Factory {
	private WebDriver driver;
	@FindBy(id="email")
	WebElement textmail;
	
	@FindBy(id="password")
	WebElement textpassword;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement buttonSignin;
	
	@FindBy(xpath="//span[@class='user-name ml10']")
	WebElement user;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	WebElement buttonSignout;
	
	public LoginPage_Factory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver,this);
	}
	public void loginFuntion(String mail, String pass) {
		textmail.clear();
		textmail.sendKeys(mail);
		textpassword.clear();
		textpassword.sendKeys(pass);
		buttonSignin.click();
	}
	public void LogoutFunction() {
		user.click();
		buttonSignout.click();
	}
}
