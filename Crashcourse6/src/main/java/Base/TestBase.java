package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		
		 
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Krishna\\eclipse-workspace\\Crashcourse6\\src\\main\\java\\Configurations\\ Config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void setUp() {
		String Browsername = prop.getProperty("Browser");
		if (Browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (Browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	

}
