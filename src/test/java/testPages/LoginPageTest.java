package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import myPages.HomePage;
import myPages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1, enabled = false)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@Test(priority = 2, enabled = false)
	public void verifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Forgot your password?");
	}
@Test(priority = 3, enabled = true)
public void verifyDoLoginTest() {
	HomePage homePage = page.getInstance(LoginPage.class).doLogin("muh.lillaqa@gmail.com", "Window@1010");
	String headerHome = homePage.getHomePageHeader();
	System.out.println(headerHome);
	Assert.assertEquals(headerHome, "Murad Murad");
}

@Test(priority = 4, enabled = true)
public void verifyDoLoginNoArgsTest() {
	page.getInstance(LoginPage.class).doLogin();
	String headerLogin = page.getInstance(LoginPage.class).getLoginPageHeader();
	System.out.println(headerLogin);
	Assert.assertEquals(headerLogin, "Forgot your password?");
}
@Test(priority = 4, enabled = true)
public void verifyDoLoginOneArgsTest() {
	page.getInstance(LoginPage.class).doLogin("muh.lillaqa@gmail.com");
	String headerLogin = page.getInstance(LoginPage.class).getLoginPageHeader();
	System.out.println(headerLogin);
	//Assert.assertEquals(headerLogin, "Forgot your password?");
}

}
