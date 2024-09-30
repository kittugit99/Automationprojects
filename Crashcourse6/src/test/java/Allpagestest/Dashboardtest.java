package Allpagestest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Dashboard;
import Pages.Login;

public class Dashboardtest  extends TestBase{
	Login login;
	Dashboard dashboard;
	@BeforeTest
	public void initilization() {
		setUp();
		login = new Login();
		login.login("david@yopmail.com", "12345678");
		dashboard = new Dashboard();
		
	}
	@Test(priority = 1)
	public void checkusernametest() {
		boolean flag = dashboard.checkusername();
		Assert.assertTrue(flag);
		
		}
	@Test(priority = 2)
	public void userlogout() {
		 login.logout();
		    String postLogoutUrl = driver.getCurrentUrl();
		    String expectedLogoutUrl = prop.getProperty("URL"); 
		    Assert.assertEquals(postLogoutUrl, expectedLogoutUrl, "Logout successful and redirected to login page");
	}
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		
	}
}
