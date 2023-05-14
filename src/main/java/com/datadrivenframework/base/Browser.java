package com.datadrivenframework.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.datadrivenframework.utils.Utility;

public class Browser {
private static Logger log = Utility.getLog(Browser.class);
	
    static WebDriver dr = null;
	
	public static WebDriver openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			dr = openChrome();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			dr = openFirefox();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			dr = openEdge();
		}
		else {
			log.info("Enter either chrome, firefox, or edge.");
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://osaconsultingtech.com");
		
		return dr;
	}
	
	public static ChromeDriver openChrome() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		dr.get("https://osaconsultingtech.com");
		
		return dr;
	}
	
	public static FirefoxDriver openFirefox() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
		FirefoxDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		dr.get("https://osaconsultingtech.com");
		
		return dr;
	}
	
	public static EdgeDriver openEdge() {
		System.setProperty("webdriver.edge.driver", "src\\main\\resources\\Drivers\\msedgedriver.exe");
		EdgeDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		dr.get("https://osaconsultingtech.com");
		
		return dr;
	}

}
