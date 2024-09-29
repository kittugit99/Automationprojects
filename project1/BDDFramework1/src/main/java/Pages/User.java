package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User {
	WebDriver driver;
	public User() {
			
	}
	@FindBy(xpath = "(//a[@class='redirect_link'])[1]") WebElement Users;
	@FindBy(xpath = "//a[@class='btn btn-success btn-sm add_users']") WebElement Useraddnew;
	@FindBy(name = "email") WebElement Email;
	@FindBy(id = "validate_email") WebElement ValidateEmail;
	@FindBy(name = "first_name") WebElement FirstName;
	@FindBy(name = "last_name") WebElement LastName;
	@FindBy(id = "company_name") WebElement Company_Name;
	@FindBy(xpath = "//a[@class='btn btn-outline green button-next']") WebElement Continue;
	@FindBy(id = "role_1_read") WebElement Dailysheet_Read;
	@FindBy(xpath = "//button[@class='btn btn-primary button-submit ']") WebElement Submit;
	public void Userbtn() {
		Users.click();
		
	}
	
public void Useradd() {
	Useraddnew.click();
	
}
public void UserForm(String email) {
	Email.sendKeys(email);
	ValidateEmail.click();
	
}
public void userinfo(String one, String account, String Moon)   {
	
	FirstName.sendKeys(one);
	LastName.sendKeys(account);
	Company_Name.sendKeys(Moon);
	Continue.click();
	}
public void userpermissions()  {
	Dailysheet_Read.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 1000)", "");
	Submit.click();
	return;
	
}

}
