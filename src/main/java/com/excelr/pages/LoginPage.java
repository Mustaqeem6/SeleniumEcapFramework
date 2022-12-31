package com.excelr.pages;

import org.openqa.selenium.By;


import com.excelr.base.OHRMBase;

public class LoginPage extends OHRMBase{
	
	public String getTitle() {
		return driver.getTitle();
		
	}
	
			public DashBoardPage Login() {
				driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
				driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
				CaptureScreenshot("login");
				driver.findElement(By.xpath("//Button[@type=\"submit\"]")).click();
				return new DashBoardPage();
			}

			private void CaptureScreenshot(String string) {
				// TODO Auto-generated method stub
				
			}

}
