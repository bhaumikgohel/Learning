package selennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends ParallelExecution{
	
	
	@Test(priority=2)
	public void click_on_Account_link() throws InterruptedException {
		
		String title = driver.getTitle();
		
		FluentWait f = new FluentWait(title);
		f.withTimeout(Duration.ofSeconds(20));
		f.pollingEvery(Duration.ofSeconds(2));
		f.withMessage("Element not found");
		f.ignoring(Exception.class);
		
		Assert.assertEquals(title, "Amazon");
		
		
		
	}
}
