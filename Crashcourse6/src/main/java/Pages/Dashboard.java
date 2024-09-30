package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Dashboard  extends TestBase{
	public Dashboard() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	@FindBy(xpath = "//span[@class='username username-hide-on-mobile']") WebElement username;

	public boolean checkusername() {
		return username.isDisplayed();
	}


}
