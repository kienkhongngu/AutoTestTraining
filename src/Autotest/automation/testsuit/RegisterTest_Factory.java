package autotest.testsuit;

import autotest.common.CommonBase;
import autotest.constant.CT_Account;
import autotest.page.Register_Factory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegisterTest_Factory extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver(CT_Account.BTVN_DAY14_URL);
    }
    @Test(priority = 1)
    public void registerSuccessfully(){
        Register_Factory register = new Register_Factory(driver);
        register.RegisterFunction("Vương Văn Tuấn", "tuan111@gmail.com", "tuan111@gmail.com", "vuongtuan232","vuongtuan232","0983665222");
        assertTrue(isElementPresent(CT_Account.KHOAHOCCUATOI));
    }
}
