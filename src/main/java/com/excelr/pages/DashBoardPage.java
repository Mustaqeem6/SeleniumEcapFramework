package com.excelr.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

import com.excelr.base.OHRMBase;

public class DashBoardPage extends OHRMBase {
	
	public boolean DashBoardLeftMenu() {
		
		return driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		
	}
	
	public boolean quickLaunchSection() {
		return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();
	}
	
	public boolean MyActionSection() {
		return driver.findElement(By.xpath("//p[text()='Quick Action']")).isDisplayed();
		
	}

}
