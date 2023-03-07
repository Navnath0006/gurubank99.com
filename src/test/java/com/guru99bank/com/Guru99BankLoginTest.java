package com.guru99bank.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99BankLoginTest extends BaseClass {
	
	@Test(priority = 1)
	public void openbrowserforloginTest() throws IOException {
		openbrowser();
	}
	@Parameters({"username","password"})
	@Test(priority = 2)
	public void LoginTest(String username, String password) {
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.switchTo().alert().accept();
	}
}
