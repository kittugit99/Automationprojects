package Allpagestest;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Dashboard;
import Pages.Login;

public class Logintest  extends TestBase{
	Login login;
	Dashboard dashboard;
	@BeforeTest
	public void Initilization() {
		setUp();
		login = new Login();
		dashboard = new Dashboard();
		}
	@Test
	public void geturltest() {
		String actualURL = login.geturl();
		String expectedURL = prop.getProperty("URL");
	    Assert.assertEquals(actualURL, expectedURL, "Correct URL displayed");
		
		
	}
	@Test
	public void getpagetitletest() {
		String actualtitle = login.getpagetitle();
		String expectedtitle = "SITEPRO";
		Assert.assertEquals(actualtitle, expectedtitle, "Correct title displayed");
	}
	@DataProvider
	public Iterator<Object[]> gettestdata() {
		ArrayList<Object[]> testdata =  Util.TestUtil.getexceldata();
		return testdata.iterator();
		}
	
	@Test(dataProvider = "gettestdata")
	@Parameters({"email", "password"})
	public void logintest(String email, String password) throws InterruptedException {
		
		login.login(email, password);
	    String currentUrl = driver.getCurrentUrl();
	    String expectedDashboardUrl = prop.getProperty("DashboardURL");
	    Assert.assertEquals(currentUrl, expectedDashboardUrl, "Login successful and redirected to dashboard");
	    login.logout();
	    String postLogoutUrl = driver.getCurrentUrl();
	    String expectedLogoutUrl = prop.getProperty("URL");
	    Assert.assertEquals(postLogoutUrl, expectedLogoutUrl, "Logout successful and redirected to login page");
		
	}
	
	@Test
	public void navigatetodashboardtest() {
		login.navigatetodashboard();
				
	}	
	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
		
		
	}
	
	
}
