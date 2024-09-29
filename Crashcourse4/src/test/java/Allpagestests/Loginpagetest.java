package Allpagestests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Dashboardpage;
import Pages.Loginpage;
import base.testbase;

public class Loginpagetest extends testbase {
	Loginpage loginpage;
	Dashboardpage dashboardpage;
	@BeforeTest
	public void setUp() {
		initilization();
		loginpage = new Loginpage();
		dashboardpage = new Dashboardpage();
				
	}
	@Test
	public void geturltest() {
		String actualURL = loginpage.geturl();
		String expectedURL = "https://beta2.moontechnolabs.com/msc_web/public/login";
	    Assert.assertEquals(actualURL, expectedURL, "Correct URL displayed");
		
		
	}
	@Test
	public void getpagetitletest() {
		String actualtitle = loginpage.getpagetitle();
		String expectedtitle = "SITEPRO";
		Assert.assertEquals(actualtitle, expectedtitle, "Correct title displayed");
	}
//	@DataProvider(name= "loginData")
//	public Object[][] getuserdata(){
//		return new Object[][] {
//			 {"email", "password"},
//	            
//		};
//	}
	
	
	@Test
	@Parameters({"email", "password"})
	public void logintest(String email, String password) throws InterruptedException {
		
		loginpage.login(email, password);
	    String currentUrl = driver.getCurrentUrl();
	    String expectedDashboardUrl = "https://beta2.moontechnolabs.com/msc_web/public/";
	    Assert.assertEquals(currentUrl, expectedDashboardUrl, "Login successful and redirected to dashboard");
	    loginpage.logout();
	    String postLogoutUrl = driver.getCurrentUrl();
	    String expectedLogoutUrl = "https://beta2.moontechnolabs.com/msc_web/public/login";
	    Assert.assertEquals(postLogoutUrl, expectedLogoutUrl, "Logout successful and redirected to login page");
		
	}
	
	@Test
	public void navigatetodashboardtest() {
		loginpage.navigatetodashboard();
				
	}	
	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
		
		
	}
	
	

}
