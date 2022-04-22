package baseClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass_1 {
public WebDriver driverInit() throws IOException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\INTEL\\Downloads\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://kite.zerodha.com//");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

return driver;}}