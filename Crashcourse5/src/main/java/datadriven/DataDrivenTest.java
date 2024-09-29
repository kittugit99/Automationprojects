package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.TestBase;
import Util.Xls_Reader;

public class DataDrivenTest extends TestBase{

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("C:/Users/Krishna/eclipse-workspace/Crashcourse5/src/main/java/Data/Book1.xlsx");
		String email = reader.getCellData("Userdata", "email", 2);
		 String password = reader.getCellData("Userdata", "password", 2);
		  System.out.println("Email: " + email);
	        System.out.println("Password: " + password);
			driver = new ChromeDriver();
			driver.get("https://beta2.moontechnolabs.com/msc_web/public/login");
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("(//button[@class='btn green pull-right'])[1]")).click();
			driver.findElement(By.xpath("//img[@class='img-circle']")).click();
			driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-default'])//li[2]")).click();
			
			

	}

}
