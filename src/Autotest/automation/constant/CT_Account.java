package autotest.constant;
import org.openqa.selenium.By;
public class CT_Account {
	public static String RISE_URL = "https://rise.fairsketch.com/signin";
		
	public static By TEXT_EMAIL = By.id("email");
	public static By TEXT_PASSWORD = By.id("password");
	public static By TEXT_BUTTON = By.xpath("//button[text()='Sign in']");
	public static By DASHBOARD = By.xpath("//span[text()='Dashboard' and @class='menu-text ']");
	public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
	public static  By TEXT_BUTTONLOGOUT = By.xpath("//a[normalize-space()='Sign Out']");
	public static By TEXT_USER = By.xpath("//*[@id=\"user-dropdown\"]/span[2]");
	
	  //DAY14 HOMEWORK
    public static String BTVN_DAY14_URL = "https://alada.vn/tai-khoan/dang-ky.html";
    public static By KHOAHOCCUATOI = By.xpath("//a[text()=\"Khóa học của tôi\" and @class=\"fleft martop20 khct\"]");
}

