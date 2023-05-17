package com.datadrivenframework.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.datadrivenframework.base.Base;
import com.datadrivenframework.utils.Utility;

public class ServicesPageTest extends Base {

@Test
public void verifyServicesPageTitle() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
String actualserviceTitle = dr.getTitle();
String expectedservicetitle = "OSA Consulting Tech - The service for you.";
Utility.verify(actualserviceTitle, expectedservicetitle);
}
@Test
public void verifyServicesPageAvailableResourcesText() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
dr.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/ul/li[1]/a")).click();
String actualAvailableResources = dr.getTitle();
String expectedAvailableResources = "Available Resources";
Utility.verify(actualAvailableResources, expectedAvailableResources);
}

@Test
public void verifyServicesPageProfessionalTraning() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
dr.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
String actualProTr = dr.getTitle();
String expectedProTr = "Professional Traning";
Utility.verify(actualProTr, expectedProTr);
}
@Test

public void verifyServicesPageOutsourcing() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
dr.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/ul/li[3]/a")).click();
String actualOutscr = dr.getTitle();
String expectedOutscr = "Outsourcing";
Utility.verify(expectedOutscr, actualOutscr);
}

public void verifyServicesPageOsaCareer() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
dr.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
String actOCr = dr.getTitle();
String extOCr = "OSA's Career";
Utility.verify(actOCr, extOCr);
}

public void verifySmallServicesText() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();

String actualverifySmallServicesText = dr.findElement(By.xpath("//span[text()='Services']")).getText();
String expectedverifySmallServicesText = "Services";
   Utility.verify(actualverifySmallServicesText, expectedverifySmallServicesText);
}


public void verifyServicesPageEmail() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
String actualverifyServicesPageEmail = dr.findElement(By.xpath("//span[text()='Email']")).getText();
String expectedverifyServicesPageEmail = "Email";
Utility.verify(actualverifyServicesPageEmail, expectedverifyServicesPageEmail);
}


public void verifyServicesPageCall() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
String actualverifyServicesPageCall = dr.findElement(By.xpath("//span[text()='Call']")).getText();
String expectedverifyServicesPageCall = "Call";
   Utility.verify(actualverifyServicesPageCall, expectedverifyServicesPageCall);
}


public void verifyServicesPageTollFree() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
String actualverifyServicesPageTollFree = dr.findElement(By.xpath("//span[text()='Toll Free']")).getText();
String expectedverifyServicesPageTollFree = "Toll Free";
Utility.verify(actualverifyServicesPageTollFree, expectedverifyServicesPageTollFree);
}


public void verifyRequestAQuote() {
dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[4]/a")).click();
String actualverifyRequestAQuote = dr.findElement(By.xpath("//a[text()='Request A Quote']")).getText();
String expectedverifyRequestAQuote = "Request A Quote";
Utility.verify(actualverifyRequestAQuote, expectedverifyRequestAQuote);
}

}
