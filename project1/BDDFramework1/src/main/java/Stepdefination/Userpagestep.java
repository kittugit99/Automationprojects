package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Login;
import Pages.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Userpagestep {
	WebDriver driver;
	
	User user;
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
		login.checktitle();
		
		
	}
	@And("^check logo of the site$")
	public void check_logo_of_the_site() {
		login.checklogo();
				
	}

	@And("^Enter (.*) and (.*)$")
	public void enter_email_and_password(String Email, String Passsword) {
		login.logincrediantials(Email, Passsword);
			    
	}

	@Then("^Click on login button$")
	public void click_on_login_button() {
	    login.Clicklogin();
	    
	}
	
	@Given("Click on User module")
	public void click_on_user_module() {
		user.Useradd();
		
	   
	}
	
	@When("^Click on create new button$")
	public void Click_on_create_new_button() {
	   user.Useradd();
	}
	@And("^Enter (.*) and Validate$")
	public void Enter_Email_and_Validate(String email) {
		user.UserForm(email);
		   
	}
	
	@Then("^Enter user information firstname lastname and companyname$")
	public void Enter_user_information_firstname_lastname_and_companyname(){
		user.userinfo("one", "account", "Moon");
	}

	@And("^Select permissions and click on submit$")
	public void select_permissions_and_click_on_submit()  {
	   user.userpermissions();
	}

}
