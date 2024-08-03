package selennium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertpopup {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
//		driver.get("https://mail.rediff.com//cgi-bin/login.cgi");
//		
//		WebElement	singup = driver.findElement(By.className("signinbtn"));
//		
//		singup.click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		Thread.sleep(3000);
//		
//		alert.accept();
		
		//------------------------------------------------------------------------------//
		
		driver.get("https://html.com/attributes/input-multiple/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("file")).sendKeys("D:\\QA-Bhaumik\\QA FRD RSM\\Ajay_Resume.pdf");
		
		Thread.sleep(3000);
		
		
		
		driver.close();
	}

}
