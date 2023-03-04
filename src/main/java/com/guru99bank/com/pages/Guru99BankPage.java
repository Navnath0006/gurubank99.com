package com.guru99bank.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99BankPage {
	
	/*
	 *@author nksoftpune.com 
	 * 
	 * */
	
	@FindBy(name = "uid")
	private WebElement userid;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbtn;
	
	public Guru99BankPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserId(String uid) {
		userid.sendKeys(uid);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLoginBtn() {
		loginbtn.click();
	}
	
}
