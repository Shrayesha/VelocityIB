package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driverInit() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\INTEL\\Downloads\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 return driver;
}
}
