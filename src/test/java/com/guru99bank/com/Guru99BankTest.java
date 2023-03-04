package com.guru99bank.com;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99bank.com.pages.Guru99BankHomePage;
import com.guru99bank.com.pages.Guru99BankPage;

public class Guru99BankTest extends BaseClass {
	
	Guru99BankPage page1;
	Guru99BankHomePage page2;
	@BeforeTest
	public void setup() throws IOException {
		openbrowser();
		page1 = new Guru99BankPage(driver);
		page2 = new Guru99BankHomePage(driver);
	}
	@Test
	public void VerifyLoginTest() throws IOException {
		page1.enterUserId(UtilityClass.getproeryfile("userid"));
		page1.enterPassword(UtilityClass.getproeryfile("password"));
		page1.clickOnLoginBtn();
		
		String welcomemsg = page2.getWelcomeMsg();
		Assert.assertEquals(welcomemsg, UtilityClass.getexceldata(1, 0));
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
