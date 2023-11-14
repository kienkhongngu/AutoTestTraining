package automation.testsuit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Login extends CommonBase {
    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://www.facebook.com/");
    }
    @Test
    public void Test(){
        System.out.println("Hello my first project!");
    }
}
