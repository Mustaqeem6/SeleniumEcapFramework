package com.Excelr.testcases;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.base.OHRMBase;
import com.excelr.pages.DashBoardPage;
import com.excelr.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends OHRMBase {
	
	LoginPage lp;
	DashBoardPage dp;
	
    @BeforeMethod
	public void browserSetup() {
		initialization();
		lp = new LoginPage();
	}
	@Test
	public void validateTitleTest() {
	    String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);		
	}
	
	@Test
	public void validateLoginTest() {
			dp = lp.Login();
		Assert.assertTrue(dp.DashBoardLeftMenu());
				
	}
	
	@AfterMethod
	public void closeSetup() {
		tearDown();
	}
}


