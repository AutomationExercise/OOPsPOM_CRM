package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	// page locators
	private By emailId = By.name("email");
	private By password = By.name("password");
	private By loginBtn = By.xpath("//div[contains(text(),'Login')]");
	private By forgotLink = By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	// constructor call
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// public getters 
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}

//	public WebElement getHeader() {
//		return getElement(forgotLink);
//	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(forgotLink);
	}
	// login method: method overloading concept applicable.
	public HomePage doLogin(String uname, String pwd) {
		getEmailId().sendKeys(uname);
		getPassword().sendKeys(pwd);
		getLoginBtn().click();
		
		return getInstance(HomePage.class);
	}
	// zero arguments
	public void doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginBtn().click();
	}
	
	// one arguments
	public void doLogin(String uname) {
		getEmailId().sendKeys(uname);
		getPassword().sendKeys("");
		getLoginBtn().click();
	}
	
	
}