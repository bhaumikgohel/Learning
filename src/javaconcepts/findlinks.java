package javaconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findlinks {
	
	public static WebDriver driver;
	
	public static void main(String[]args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	List<WebElement> a =  driver.findElements(By.tagName("a"));
	int sizea = a.size();
	System.out.println(sizea);
	
	for(int i=1;i<sizea;i++)
	{
		WebElement b = a.get(i);
		
		String c = b.getText();
		System.out.println(c);
	}
	
	String ab = "Bhaumik";
	
	String ii = " ";
	
	int c = ab.length();
	
	for(int i=c-1;i>=0;i--) {
		ii = ii + ab.charAt(i);
	}
	
	
	}

}
