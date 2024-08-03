package selennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class TestCase1 extends ParallelExecution{

	@Test(priority=1)
	public void verify_TitleLogo() throws InterruptedException{
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']"));
		
		FluentWait f = new FluentWait(searchbox);
		f.withTimeout(Duration.ofSeconds(20));
		f.pollingEvery(Duration.ofSeconds(2));
		f.withMessage("Element not found");
		f.ignoring(Exception.class);
		
		
		searchbox.sendKeys("iphone 15");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
}
