package datadriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizeTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader("C:/Users/Krishna/eclipse-workspace/Crashcourse5/src/main/java/Data/Book1.xlsx");
		int rowcount = reader.getRowCount("Userdata");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		reader.addColumn("Userdata", "Status");
			driver.get("https://beta2.moontechnolabs.com/msc_web/public/login");
		
		for(int rowNum =2; rowNum <=rowcount; rowNum++) {
			String email = reader.getCellData("Userdata", "email", rowNum);
			System.out.println(email);
			 String password = reader.getCellData("Userdata", "password", rowNum);
			System.out.println(password);
			
			
				driver.findElement(By.name("email")).sendKeys(email);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.xpath("(//button[@class='btn green pull-right'])[1]")).click();
				driver.findElement(By.xpath("//img[@class='img-circle']")).click();
				driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-default'])//li[2]")).click();
				reader.setCellData("Userdata", "Status", rowNum, "PASS");
				
		}
		
	}

}
