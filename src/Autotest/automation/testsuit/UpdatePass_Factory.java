package autotest.testsuit;

import autotest.common.CommonBase;
import autotest.constant.CT_Account;
import autotest.page.Register_Factory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UpdatePass_Factory extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
    }
    @Test(priority = 1)
    public void updatePassword(){
        Register_Factory register = new Register_Factory(driver);
        register.LoginFunction("tuan111@gmail.com", "vuongtuan232");
        register.UpdateFunction("vuongtuan232", "vuongtuan2002", "vuongtuan2002");
    }
    @Test(priority = 2)
    public void LoginByNewPass(){
        Register_Factory register = new Register_Factory(driver);
        register.LoginFunction("tuan111@gmail.com", "vuongtuan2002");
        assertTrue(isElementPresent(CT_Account.KHOAHOCCUATOI));
    }
}
