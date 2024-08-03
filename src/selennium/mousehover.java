package selennium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://sellglobal.ebay.in/seller-center/home/");
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// its for page load time within 10 seconds if it load in 3 seconds the rest of 7 seconds are ignore
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// its load for webelements load in 30 seconds after its give exceptions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
		
		// By using action class focus move to the specif element 
		a.moveToElement(driver.findElement(By.linkText("Shipping"))).build().perform();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.linkText("eBay One-Stop Shipping Solution (EGS)")).click();
		
		//driver.close();

	}

}
