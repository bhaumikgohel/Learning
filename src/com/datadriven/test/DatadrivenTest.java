package com.datadriven.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import datadrivern.Utilitiespackage;

public class DatadrivenTest {

	public static void main(String[] args) {
		
		Utilitiespackage reader = new Utilitiespackage("");
		
		String firstname = reader.getCellData("Sheet1", "firstname", 2);
		
		System.out.println(firstname);
		
		
//		System.setProperty("driver.chrome.driver", ".//chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=html-registration-form1");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
//		
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='iframewrapper']"));
//		
//		driver.switchTo().frame(frame2);
		
		
		
	}

}
