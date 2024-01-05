/**
 * 
 */
package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class HomePage extends BasePage {

	private By header = By.xpath("//span[contains(text(),'Murad Murad')]");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getHomePageHeader() {
		return getHeader().getText();
	}
	
	public String getHomePageTitle() {
		return getPageTitle();
	}

}
