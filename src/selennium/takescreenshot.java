package selennium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.sql.StatementEventListener;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class takescreenshot {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("driver.chrome.driver", ".//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Automation\\javaconcepts\\src\\selennium\\google.png"));
		
		driver.navigate().to("https://amazon.in");
		
		
		clickon(driver, driver.findElement(By.xpath("//a[text()='Mobiles']")), 10);
		
		
		
		Thread.sleep(3000);
		
		driver.close();
	}

	// explicit wait for element 
	public static void clickon(WebDriver driver, WebElement locator, int timeout)
	{
		new WebDriverWait(driver, Duration.ofSeconds(0)).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
}
