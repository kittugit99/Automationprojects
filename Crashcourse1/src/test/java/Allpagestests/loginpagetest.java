package Allpagestests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Allpages.dashboard;
import Allpages.loginpage;
import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpagetest extends TestBase{
	loginpage Loginpage;
	dashboard Dashboard;


	@Before
	public void setUp() {
		initilization();
		Loginpage = new loginpage();
		}
	@After
	public void teardown() {
		if (driver != null) {
            driver.quit();
		}

	}

@Given("I have entered a valid Email and Password")
public void i_have_entered_a_valid_email_and_password() {
	Loginpage.enterlogindetails("james@yopmail.com", "12345678");

}

@When("I click on login button")
public void i_click_on_login_button() {
	Loginpage.login();

}

@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() {
	Loginpage.navigatetodashboard();

}

@Given("I have entered invalid {string} and {string}")
public void i_have_entered_invalid_and(String Email, String Password) {
	Loginpage.invalidcrediantials(Email, Password);

}

@Then("I should see an error message {string}")
public void i_should_see_an_error_message(String ExpectedMessage) {
	
	String Actualmessage = Loginpage.checkinvalidcrediantialserrormessage();
	//String Expectedmessage = "These credentials do not match our records.";
	Assert.assertEquals(Actualmessage, ExpectedMessage, "Error message validation failed.");

}

@When("I click on forgot password page")
public void i_click_on_forgot_password_page() {

}

@Then("It should redirect to password reset page")
public void it_should_redirect_to_password_reset_page() {

}

}
