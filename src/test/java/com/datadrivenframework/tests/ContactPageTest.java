package com.datadrivenframework.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.datadrivenframework.base.Base;
import com.datadrivenframework.utils.Utility;

public class ContactPageTest extends Base {
@Test
public void verifyContactPageTitle() {
dr.findElement(By.xpath("/html/head/title")).click();
String actualContactPageTitle = dr.getTitle();
String expectedContactPageTitle = "OSA Consulting Tech - Contact for any question.";
Utility.verify(actualContactPageTitle, expectedContactPageTitle);
}
@Test
public void verifyContactPageEmail() {

String actualContactPageEmail = dr.findElement(By.xpath("//span[text()='Email']")).getText();
String expectedContactPageEmail = "Email";
Utility.verify(actualContactPageEmail, expectedContactPageEmail);
}
@Test
public void verifyContactPageCall() {
String actualContactPageCall =dr.findElement(By.xpath("//span[text()='Call']")).getText();
String expectedContactPageCall = "Call";
Utility.verify(actualContactPageCall, expectedContactPageCall);

}
@Test
public void verifyContactPageTollFree() {
String actualContactPageTollFree = dr.findElement(By.xpath("//span[text()='Toll Free']")).getText();
String expectedContactPageTollFree = "Toll Free";
Utility.verify(actualContactPageTollFree, expectedContactPageTollFree);

}
@Test
public void verifyContactPageAddress() {
String actualContactPageAddress =dr.findElement(By.xpath("//span[text()='Address:']")).getText();
String expectedContactPageAddress ="Address:";
Utility.verify(actualContactPageAddress, expectedContactPageAddress);
}
@Test
public void verifyContactPagePhone() {
String actualContactPagePhone = dr.findElement(By.xpath("//span[text()='Phone:']")).getText();
String expectedContactPagePhone = "Phone:";
Utility.verify(actualContactPagePhone, expectedContactPagePhone);

}
@Test
public void verifyContactPageEmaill() {
String actualContactPageEmaill = dr.findElement(By.xpath("//span[text()='Email:']")).getText();
String expectedContactPageEmaill = "Emaill";
Utility.verify(actualContactPageEmaill, expectedContactPageEmaill);
}
@Test
public void verifyContactPageYourName() {
String actualContactPageYourName = dr.findElement(By.xpath("//input[@placeholder='Your Name']")).getText();
String expectedContactPageYourName= "YourName";
Utility.verify(actualContactPageYourName, expectedContactPageYourName);
}
@Test
public void verifyContactPageYourEmail() {
String actualContactPageYourName = dr.findElement(By.xpath("//input[@placeholder='Your Email']")).getText();
String expectedContactPageYourName= "YourName";
Utility.verify(actualContactPageYourName, expectedContactPageYourName);
}
@Test
public void verifyContactPageSubject() {
String actualContactPageSubject = dr.findElement(By.xpath("//input[@placeholder='Subject']")).getText();
String expectedContactPageSubject= "Subject";
Utility.verify(actualContactPageSubject, expectedContactPageSubject);
}
@Test
public void verifyContactPageMessage() {
String actualContactPageMessage = dr.findElement(By.xpath("//textarea[@placeholder='Message']")).getText();
String expectedContactPageMessage= "Message";
Utility.verify(actualContactPageMessage, expectedContactPageMessage);
}
}

