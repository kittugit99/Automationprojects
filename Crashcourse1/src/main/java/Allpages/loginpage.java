package Allpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class loginpage extends TestBase{

	public loginpage() {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);


	}
	@FindBy(name = "email") WebElement EMAIL;
	@FindBy(name = "password") WebElement PWD;
	@FindBy(xpath = "(//button[@class='btn green pull-right'])[1]") WebElement Login;
	@FindBy(xpath = "/html/body/div[4]/a/img") WebElement Logo;
	@FindBy(xpath = "/html/body/div[5]/form[1]/div[2]/span") WebElement Errormessage;

	public void enterlogindetails(String Email, String Password) {
		EMAIL.sendKeys(Email);
		PWD.sendKeys(Password);

	}
	public void login() {
		Login.click();
	}
	public dashboard navigatetodashboard() {
		return new dashboard();


	}
	public void invalidcrediantials(String Email, String Password) {
		EMAIL.sendKeys(Email);
		PWD.sendKeys(Password);

	}
	public String checkinvalidcrediantialserrormessage() {
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/form[1]/div[2]/span")));
		 if (errorMessageElement.isDisplayed()) {
		        return errorMessageElement.getText();
		    } else {
		        return "";  
		    }



}
}
