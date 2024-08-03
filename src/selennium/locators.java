package selennium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locators {
	
	WebDriver driver;
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\javaconcepts\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		
		
	}

}
