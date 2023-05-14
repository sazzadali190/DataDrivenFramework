package com.datadrivenframework.base;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.*;

public class Base {
	public static HashMap<String,WebDriver> hp=new HashMap<String,WebDriver>();
	public WebDriver dr;
	
    @Parameters("browserName")
	@BeforeMethod
	public void openBrowser(String browserName) {
		dr = Browser.openBrowser(browserName);
		hp.put("driver", dr);
	}
	
	@AfterMethod
	public void closeBrowser() {
		dr.quit();
	}

}
