package com.guru99bank.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public void openbrowser() throws IOException  {
		driver = new FirefoxDriver();
		driver.get(UtilityClass.getproeryfile("url"));
	}
}
