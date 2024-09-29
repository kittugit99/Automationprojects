package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Login;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Loginpagestep {
	WebDriver driver;
	Login login;
	
	
	@Given("^Open browser$")
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		login = new Login(driver);
		    
	}

	@When("^Enter site URL$")
	public void enter_site_url() {
	    driver.get("https://beta2.moontechnolabs.com/msc_web/public/login");
	    driver.manage().window().maximize();
	}
	@And("^check page title$")
	public void check_page_title() {
		String title = login.checktitle();
		Assert.assertEquals(title, "SITEPRO");
		
	}
	@And("^check logo of the site$")
	public void check_logo_of_the_site() {
		boolean flag= login.checklogo();
		
		
	}

	@And("^Enter (.*) and (.*)$")
	public void enter_email_and_password(String Email, String Passsword) {
		login.logincrediantials(Email, Passsword);
			    
	}

	@Then("^Click on login button$")
	public void click_on_login_button() {
	    login.Clicklogin();
	    
	}

	@And("^Navigate to dashboard$")
	public void navigate_to_dashboard() {
	 
	}
	@Then("Navigate to Usermenu from dashboard")
	public void navigate_to_usermenu_from_dashboard() {
	    System.out.println("Usermenu");
	}

	@Then("Click on create new button")
	public void click_on_create_new_button() {
	   System.out.println("create new user");
	}

	@Then("Create new user")
	public void create_new_user() {
		System.out.println("created new user");
	    
	}
	
	@After
	public void teardown() {
	driver.quit();
}
}
