package selennium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
//	WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=htmliframes");
		 
		driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 
		 System.out.println("frame");
		 
		 Thread.sleep(3000);
		 
		 WebElement serch =  driver.findElement(By.xpath("//*[@id=\"city\"]/table/tbody/tr/td/div[1]/img"));
		 serch.sendKeys("This is search box");
		 
		 serch.sendKeys(Keys.ESCAPE);
		 
		 System.out.println("click on frame");
		 
		 driver.close();
	}

}
