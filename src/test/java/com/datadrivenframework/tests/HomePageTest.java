package com.datadrivenframework.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.datadrivenframework.base.Base;
import com.datadrivenframework.utils.Utility;

@Listeners(com.datadrivenframework.base.MyTestListener.class)
public class HomePageTest extends Base {
	
	@Test
	public void verifyHomePageTitle() {
		dr.getTitle();
		String actualHomePageTitle = dr.getTitle();
		String expectedHomePageTitle = "OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		Utility.verify(actualHomePageTitle, expectedHomePageTitle);
	}
	
	@Test
	public void verifyTollFreeText() {
		String actualTollFreeText = dr.findElement(By.xpath("//span[text()='Toll Free']")).getText();
		String expectedTollFreeText = "Toll Free";
		Utility.verify(actualTollFreeText, expectedTollFreeText);
	}
	
	@Test
	public void verifyAboutPageButtonText() {
		String actualAboutPageButtonText = dr.findElement(By.xpath("//div[@id='ftco-nav']/ul/li[2]/a")).getText();
		String expectedAboutPageButtonText = "About";
		Utility.verify(actualAboutPageButtonText, expectedAboutPageButtonText);
	}
	
	@Test
	public void verifyFirstNameInputBoxText() {
		String actualFirstNameInputBoxText = dr.findElement(By.name("fName")).getText();
		String expectedLastNameInputBoxText = "First Name";
		Utility.verify(actualFirstNameInputBoxText, expectedLastNameInputBoxText);
	}
	
	@Test
	public void verifyLastNameInputBoxText() {
		String actualLastNameInputBoxText = dr.findElement(By.name("lName")).getText();
		String expectedLastNameInputBoxText = "Last Name";
		Utility.verify(actualLastNameInputBoxText, expectedLastNameInputBoxText);
	}
	
	@Test
	public void verifyPhoneInputBoxText() {
		String actualPhoneInputBoxText = dr.findElement(By.name("phone")).getText();
		String expectedPhoneInputBoxText = "Phone";
		Utility.verify(actualPhoneInputBoxText, expectedPhoneInputBoxText);
	}
	
	@Test
	public void verifyEmailInputBoxText() {
		String actualEmailInputBoxText = dr.findElement(By.name("email")).getText();
		String expectedEmailInputBoxText = "Email";
		Utility.verify(actualEmailInputBoxText, expectedEmailInputBoxText);
	}
	
	@Test
	public void verifyMessageInputBoxText() {
		String actualMessageInputBoxText = dr.findElement(By.name("message")).getText();
		String expectedMessageInputBoxText = "Message";
		Utility.verify(actualMessageInputBoxText, expectedMessageInputBoxText);
	}
	
	@Test
	public void verifySearchBoxText() {
		String actualSearchBoxText = dr.findElement(By.xpath("//nav[@id=\"ftco-navbar\"]/div/form/div/input")).getText();
		String expectedSearchBoxText = "Search";
		Utility.verify(actualSearchBoxText, expectedSearchBoxText);
	}
	
	@Test
	public void verifyTestimoniesText() {
		String actualTestimoniesText = dr.findElement(By.xpath("//span[text()='Testimonies']")).getText();
		String expectedTestimoniesText = "Testimonies";
		Utility.verify(actualTestimoniesText, expectedTestimoniesText);
	}
	
	@Test
	public void verifyOurClientsSaysText() {
		String actualOurClientsSaysText = dr.findElement(By.xpath("//h2[text()='Our Clients Says']")).getText();
		String expectedOurClientsSaysText = "Our Clients Says";
		Utility.verify(actualOurClientsSaysText, expectedOurClientsSaysText);
	}
	
	@Test
	public void verifyTrainingPageButtonText() {
		String actualTrainingPageButtonText = dr.findElement(By.xpath("//div[@id=\"ftco-nav\"]/ul/li[3]/a")).getText();
		String expectedTrainingPageButtonText = "Training";
		Utility.verify(actualTrainingPageButtonText, expectedTrainingPageButtonText);
	}
	
	@Test
	public void verifyServicesPageButtonText() {
		String actualServicesPageButtonText = dr.findElement(By.xpath("//div[@id=\"ftco-nav\"]/ul/li[4]/a")).getText();
		String expectedServicesPageButtonText = "Services";
		Utility.verify(actualServicesPageButtonText, expectedServicesPageButtonText);
	}
	
	@Test
	public void verifyBlogPageButtonText() {
		String actualBlogPageButtonText = dr.findElement(By.xpath("//div[@id=\"ftco-nav\"]/ul/li[5]/a")).getText();
		String expectedBlogPageButtonText = "Services";
		Utility.verify(actualBlogPageButtonText, expectedBlogPageButtonText);
	}

}
