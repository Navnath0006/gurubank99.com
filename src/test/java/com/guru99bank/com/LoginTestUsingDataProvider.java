package com.guru99bank.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestUsingDataProvider extends BaseClass {

	@DataProvider(name="data-set")
	public static Object[][] Dataset(){
		Object[][] obj = {{"invalid Password and valid Username","mngr482972","sgsag"},
						  {"valid Password and invalid username","gargerfg","Eqyvyda"},
						  {"invalid Password and invalid username","gargerfg","aehfhae"}
						};
		return obj;
	}
	@Test(dataProvider = "data-set")
	public void VerifyLoginwithDiffCombination(String type,String username,String password) throws IOException, InterruptedException{
			
		openbrowser();
		System.out.println(type+" "+username+" "+password);
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
	}	
}
