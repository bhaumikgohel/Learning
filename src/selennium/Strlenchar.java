package selennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Strlenchar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./javaconcepts/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mmrdawebdev.amnex.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ab = driver.findElement(By.xpath("//*[contains(text(),'Calculate')]"));

	}

}
