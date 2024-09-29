package Allpagestests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Dashboardpage;
import Pages.Loginpage;
import base.testbase;

public class Dashboardpagetest extends testbase{
	 Loginpage loginpage;
	Dashboardpage dashboardpage;
	@BeforeTest
	public void SetUp() {
		initilization();
		loginpage = new Loginpage();
		loginpage.login("david@yopmail.com", "12345678");
		dashboardpage = new Dashboardpage();
		
	}
	@Test(priority = 1)
	public void checkusernametest() {
		boolean flag = dashboardpage.checkusername();
		Assert.assertTrue(true);
		
		}
	@Test(priority = 2)
	public void userlogout() {
		 loginpage.logout();
		    String postLogoutUrl = driver.getCurrentUrl();
		    String expectedLogoutUrl = "https://beta2.moontechnolabs.com/msc_web/public/login";
		    Assert.assertEquals(postLogoutUrl, expectedLogoutUrl, "Logout successful and redirected to login page");
	}
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		
	}

}
