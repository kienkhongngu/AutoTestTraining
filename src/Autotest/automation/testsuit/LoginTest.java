package autotest.testsuit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autotest.common.CommonBase;
import autotest.constant.CT_Account;
import autotest.page.LoginPage;

public class LoginTest extends CommonBase {

    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test(priority = 1)
    public void LoginSuccess() {
        LoginPage login = new LoginPage(driver);
        login.LoginFunction("client@demo.com", "riseDemo");
        assertTrue(driver.findElement(CT_Account.DASHBOARD).isDisplayed());
    }

    @Test(priority = 2)
    public void LoginFailIncorrectEmail() {
        LoginPage login = new LoginPage(driver);
        login.LoginFunction("client_incorrect@demo.com", "riseDemo");
        assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());
    }

    @Test(priority = 3)
    public void LoginIncorrectPass() {
        LoginPage login = new LoginPage(driver);
        login.LoginFunction("client@demo.com", "riseDemo_incorrect");
        assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());
    }

    @Test(priority = 4)
    public void LoginIncorrectEmailandPass() {
        LoginPage login = new LoginPage(driver);
        login.LoginFunction("client_incorrect@demo.com", "riseDemo_incorrect");
        assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());
    }
    @Test(priority = 5)
    public void Logout() {
    LoginPage login = new LoginPage(driver);
    login.LoginFunction("client@demo.com", "riseDemo");
    login.LogoutFunction();
    assertTrue(driver.findElement(CT_Account.TEXT_BUTTONLOGOUT).isDisplayed());
    }
}
