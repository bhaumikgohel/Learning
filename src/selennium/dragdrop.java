package selennium;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		a.clickAndHold(driver.findElement(By.xpath("(//img[@id='drag1'])[1]")))
		
		.moveToElement(driver.findElement(By.xpath("//div[@id='div1']")))
		
		.release()
		.build()
		.perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
