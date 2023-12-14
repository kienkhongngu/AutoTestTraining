package autotest.testsuit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autotest.common.CommonBase;

public class Day16_Alert2 extends CommonBase {
	@BeforeMethod
	public void initChromeDriver() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
	}
	@Test(priority = 1)
	public void alertwithOk() {
		click(By.xpath("//a[text()='Alert with OK ']"));
		click(By.xpath("//*[@id=\"OKTab\"]/button"));
		String msgOk = driver.switchTo().alert().getText(); 
		assertEquals(msgOk,"I am an alert box!");
		driver.switchTo().alert().accept();
	}
	@Test(priority = 2)
	public void alertWithOKandCancel() {
		click(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		click(By.xpath("//button[text()='click the button to display a confirm box ']"));
		String msgCancel = driver.switchTo().alert().getText();
		assertEquals(msgCancel,"Press a Button !");
		driver.switchTo().alert().accept();
	}
	@Test(priority = 3)
	public void alertWithTextBox() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		driver.switchTo().alert().sendKeys("1234");
		driver.switchTo().alert().accept();
		assertTrue(isElementPresent(By.xpath("//p[text()='Hello 1234 How are you today']")));
	}
}
