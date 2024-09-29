package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.testbase;

public class Dashboardpage extends testbase{
	public Dashboardpage() {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	
}
@FindBy(xpath = "//span[@class='username username-hide-on-mobile']") WebElement username;

public boolean checkusername() {
	return username.isDisplayed();
}

}