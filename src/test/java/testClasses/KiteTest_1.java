package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseClass_1;
import baseClasses.Utility_1;
import pomClasses.KiteLogin_1;

public class KiteTest_1 {
BaseClass_1 base;
WebDriver driver;
KiteLogin_1 kite;
String tcID;

@BeforeClass
public void launchBrowser() throws IOException {
	base = new BaseClass_1();
	driver = base.driverInit();
	kite = new KiteLogin_1(driver);
}

@BeforeMethod
public void refresh() {
	driver.navigate().refresh();
}

@Test
public void validCredentialLogin() throws IOException {
	tcID = "201";
	kite.enterUsername(Utility_1.readPropertyFileData("UNAME"));
	kite.enterPassword(Utility_1.readPropertyFileData("PWORD"));
	kite.loginButton();
	kite.passCode(Utility_1.readPropertyFileData("PCODE"));
	kite.clickbutton();
	String UserID = kite.getUserID();
	Assert.assertEquals(UserID, Utility_1.readPropertyFileData("UNAME"));
}

@AfterMethod
public void takesScreenshot(ITestResult result) throws IOException {
	if(ITestResult.FAILURE==result.getStatus()) {
		Utility_1.captureScreenshot(driver, tcID);
	}
}

@AfterClass
public void closeBrowser() {
	driver.close();
}
































}
