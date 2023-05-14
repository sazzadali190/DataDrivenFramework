package com.datadrivenframework.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.datadrivenframework.base.Base;
import com.datadrivenframework.utils.DataProviders;
@Listeners(com.datadrivenframework.base.MyTestListener.class)
public class ForumPageTest extends Base{
	
	@Test(dataProvider = "forumLogin", dataProviderClass = DataProviders.class)
	public void verifyForumPageLogin(String username, String password) throws InterruptedException {
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		dr.findElement(By.id("username")).sendKeys(username);
		dr.findElement(By.id("password")).sendKeys(password);
		dr.findElement(By.id("login_button")).click();
		Thread.sleep(5000);
	}

}
