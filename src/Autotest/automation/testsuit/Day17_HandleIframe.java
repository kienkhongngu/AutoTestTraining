package autotest.testsuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autotest.common.CommonBase;

public class Day17_HandleIframe extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://codestar.vn/");
	}

	@Test
	public void verifyRegister() {
		pause(5000);
		int sizeIframe = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < sizeIframe; i++) {
			// phuong phap tim index cua iframe
			driver.switchTo().frame(i);
			int totalBTNSend = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
			System.out.println("TotalBtnSend:" + totalBTNSend);
			//neu total !=0 thi dang dung tai iframe chua element can thuc thi
			if (totalBTNSend != 0) {
				type(By.id("account_phone"), "0367072032");
				click(By.xpath("//button[text()='Gửi ngay']"));
				isElementPresent(By.xpath("//button[text(🙁'Gửi ngay']"));
				//dong iframe truoc khi chuyen sang iframe ke tiep
				driver.switchTo().defaultContent();
			} else {
				driver.switchTo().defaultContent();
			}

		}
			
		
	}
	@Test
	public void Register() {
		pause(5000);
		driver.switchTo().frame(3);
		type(By.name("account_name"),"Vuong Van Tuan");
		type(By.id("account_phone"),"0367072032");
		click(By.xpath("//button[text()='Đăng ký ngay']"));
		isElementPresent(By.xpath("//button[text()='Đăng ký ngay']"));
	}
	
}