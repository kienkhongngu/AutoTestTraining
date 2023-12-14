package autotest.testsuit;

import autotest.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day16_BTVN extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
    }
    @Test
    public void Alert(){
        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
        pause(10000);
        String msg = driver.switchTo().alert().getText();
        Assert.assertEquals(msg, "Welcome to Selenium WebDriver Tutorials");
        driver.switchTo().alert().accept();
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
