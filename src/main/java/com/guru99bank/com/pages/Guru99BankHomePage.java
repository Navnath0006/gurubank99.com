package com.guru99bank.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99BankHomePage {
	
		/*
		 * @author : nksoftpune.com
		 * */
	@FindBy(xpath = "//*[@style='color: green']")
	private WebElement welcomemsg;
	
	public Guru99BankHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getWelcomeMsg() {
		return welcomemsg.getText();
	}
	
}
