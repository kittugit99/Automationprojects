package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "email") WebElement EMAIL;
	@FindBy(name = "password") WebElement PASSWORD;
	@FindBy(xpath = "(//button[@class='btn green pull-right'])[1]") WebElement Login;
	@FindBy(xpath = "/html/body/div[4]/a/img") WebElement Logo;
	public String checktitle() {
		return driver.getTitle();
	}
	public boolean checklogo() {
		return Logo.isDisplayed();
	}

public void logincrediantials(String Email, String Password) {
	EMAIL.sendKeys(Email);
	PASSWORD.sendKeys(Password);
	
}
public void Clicklogin() {
	Login.click();
}


}
