package com.Excelr.testcases;

import java.time.Duration;

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

public class DashboardPageTest extends OHRMBase{
	WebDriver driver;
	LoginPage lp ;
	DashBoardPage dp;
	@BeforeMethod
	public void browserSetup() {
		initialization();
		lp = new LoginPage();
	}
	@Test
	public void ValidateQuickLaunchSection() {
		dp = lp.Login();
	Assert.assertTrue(dp.quickLaunchSection());
	}
	
	public void ValidateMyQuickActions() {
		dp = lp.Login();
		Assert.assertTrue(dp.MyActionSection());
		
	}
		
	
	@AfterMethod
	public void closeSetup() {
		tearDown();

}
}