package com.datadrivenframework.utils;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	/*@DataProvider(name = "forumLogin")
	public String[][] forumLoginTest1(){
		String data[][] = {{"user1", "pass1"},{"user2", "pass2"},{"user3", "pass3"}};
		return data;
	}*/
	
	@DataProvider(name = "forumLogin")
	public static Object[][] forumLoginTest(){
		Object myTestData[][] = Utility.readExcel("src\\test\\resources\\students.xlsx", "ForumLogin");
		return myTestData;
	}

}
