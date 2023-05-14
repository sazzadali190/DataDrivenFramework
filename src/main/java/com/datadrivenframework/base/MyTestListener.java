package com.datadrivenframework.base;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.datadrivenframework.utils.Utility;

public class MyTestListener implements ITestListener {
private static Logger log = Utility.getLog(MyTestListener.class);
	
public void onTestStart(ITestResult result) {
log.info("New Test Started " + result.getName());
}
public void onTestSuccess(ITestResult result) {
log.info("Test Successfully Finished " + result.getName());
}
public void onTestFailure(ITestResult result) {
log.info("Test Failed " + result.getName());
Utility.takeScreenShot(Base.hp.get("driver"));
}
public void onTestSkipped(ITestResult result) {
log.info("Test Skipped " + result.getName());
}
}
