package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Login extends TestBase{
	public Login() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
				
	}
	@FindBy (name = "email") WebElement EmailID;
	@FindBy(name = "password") WebElement Password;
	@FindBy(xpath = "(//button[@class='btn green pull-right'])[1]") WebElement login;
	@FindBy(xpath = "//img[@class='img-circle']") WebElement clickprofile;
	@FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu-default'])//li[2]") WebElement logout;
		
	public String geturl() {
		return driver.getCurrentUrl();
				
	}
	public String getpagetitle() {
		return driver.getTitle();
				
		}
	public void login(String email, String password) {
		EmailID.sendKeys(email);
		Password.sendKeys(password);
		login.click();
		
	}
	public Dashboard navigatetodashboard() {
		return new Dashboard();
			
	}
	public void logout() {
		clickprofile.click();
		logout.click();
		
	}

}
