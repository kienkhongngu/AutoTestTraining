
package autotest.testsuit;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autotest.common.CommonBase;

public class Day17_PopupWindow extends CommonBase {

    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://demo.guru99.com/popup.php");
    }

    @Test
    public void testGuru() {
        // after navigating to the web, click the "Click Here" button
        click(By.xpath("//a[text()='Click Here']"));

        // get handles of all open windows
        Set<String> listWindow = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();

        // switch to the popup window
        for (String childWindow : listWindow) {
            if (!childWindow.equalsIgnoreCase(mainWindow)) {
                driver.switchTo().window(childWindow);

                // assert the URL of the popup window
                assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/articles_popup.php");

                // enter email and click the login button
                type(By.xpath("//input[@name='emailid']"), "demo@gmail.com");
                click(By.xpath("//input[@name='btnLogin']"));

                // assert the presence of the element in the popup window
                isElementPresent(By.xpath("//h2[text()='Access details to demo site.']"));

                // close the popup window
                driver.close();
            }
        }

        // switch back to the main window
        driver.switchTo().window(mainWindow);

        // assert the URL of the main window
        assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/popup.php");
    }
}