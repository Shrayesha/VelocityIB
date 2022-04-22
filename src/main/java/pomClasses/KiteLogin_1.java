package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin_1 {
	
	@FindBy(xpath="//input[@type='text']")private WebElement username;
	@FindBy(xpath="//input[@type='password']")private WebElement password;	
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	@FindBy(xpath="//input[@id='pin']")private WebElement passcode;
	@FindBy(xpath="//button[@type='submit']")private WebElement button;	
	@FindBy(xpath="//span[text()='AL0737']")private WebElement getuserid;


  public KiteLogin_1 (WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }

  public void enterUsername(String uname) {
	  username.sendKeys(uname);
  }
public void enterPassword(String pword) {
	password.sendKeys(pword);
}
 public void loginButton() {
	loginbutton.click(); 
 }

public void passCode(String pcode) {
	passcode.sendKeys(pcode);
	
}

public void clickbutton() {
	button.click();
}
 
public String getUserID () {
	String text = getuserid.getText();
	return text;
}




















}
