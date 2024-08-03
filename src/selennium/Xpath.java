package selennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "./javaconcepts/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://grotechminds.com/registration/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	
		WebElement male = driver.findElement(By.xpath("//label[@for='Male']"));

		male.click();
		
		Boolean b = male.isSelected();
		
		System.out.println(b);
		
		
		
		WebElement female = driver.findElement(By.xpath("//input[@value='FeMale' and @id='FeMale' and @type='radio']"));
		
		Boolean c = female.isDisplayed();
		
		System.out.println(c);
		
		WebElement lbl1 = driver.findElement(By.xpath("//label[contains(text(),'First name:')]"));
		
		WebElement fristname = driver.findElement(By.xpath("//input[@id='fname' and @class='tf']"));
		
		fristname.sendKeys("Bhaumik");
		
		String result = lbl1.getText();
		
		System.out.println(result);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='Username' and @class='tf']"));
		
		username.sendKeys("Gohel");
		
		String user = username.getAttribute("value");
		
		System.out.println(user);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='Relegion ss' and @name='Relegion' and @name='Relegion']"));
		Select sc = new Select(dropdown);
		
//		sc.selectByIndex(2);
		
		sc.selectByVisibleText("Jews");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

	
		
}

	
