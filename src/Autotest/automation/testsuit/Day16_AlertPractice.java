package autotest.testsuit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autotest.common.CommonBase;

public class Day16_AlertPractice extends CommonBase {
	@BeforeMethod
	public void initChromeDriver() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
	}
	@Test
	public void deleteCustomer() {
		type(By.xpath("//input[@name='cusid']"), "161238");
		click(By.xpath("//input[@name='submit']"));
		String msgconfirm = driver.switchTo().alert().getText();
		assertEquals(msgconfirm,"Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		String msgDelete = driver.switchTo().alert().getText();
		assertEquals(msgDelete, "Customer Successfully Delete!");
 	}
//	@AfterMethod
//	public void quitDriver() {
//		driver.close();
//	}
}
