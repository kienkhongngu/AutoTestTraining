package autotest.testsuit;

import autotest.common.CommonBase;
import autotest.constant.CT_Account;
import autotest.page.Client_Page;
import autotest.page.LoginPage;
import autotest.page.LoginPage_Factory;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClienTest extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver(CT_Account.RISE_URL);
    }
    @Test
    public void AddClientSuccessfully() throws InterruptedException {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFuntion("admin@demo.com","riseDemo");
        Client_Page client = new Client_Page(driver);
        client.AddClientFunction("TNHH","Phil John","Ha Noi","Ha Noi","Ha Tay","10001","Viet Nam","09123456789","facebook.com","12312","213123","VIP","CUC","abc","Inactive");
        Thread.sleep(3000);
        isElementPresent(By.xpath("//a[text()='Demo Company']"));
    }
}
