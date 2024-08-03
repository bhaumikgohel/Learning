package selennium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		dr.get("https://grotechminds.com/window-handle-and-handles/");
		
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		dr.findElement(By.xpath("//button[contains(text(),'Launch Broweser 1')]")).click();
		
		Thread.sleep(3000);

		//Get windowhandle() method to get current window id only
		
		String gwh = dr.getWindowHandle();
		System.out.println("Get window handle "+ gwh);
		
		// it give you window id's in the form of set of String from
		Set<String> wid = dr.getWindowHandles();
		
		
		System.out.println("This is window ids "+wid);
		
		//set of string does not store value in the form of index or list so we are use iterator
		Iterator<String> it = wid.iterator();
		
		System.out.println("This is iterators "+it);
		
		// iterator point the top of the stack so its point first one we use iterator.next() method
		String parentwinid = it.next();
		
		System.out.println("This is parent window id: " + parentwinid);
		
		//Then get child window id by using it.next() method
		String childwinid = it.next();
		
		System.out.println("This is child window id: "+ childwinid);
		
		//Now cursor move to child window id and perform some action
		dr.switchTo().window(childwinid);
		
		String chldtitle = dr.getTitle();
		
		System.out.println(chldtitle);
		
		Thread.sleep(2000);
		
		//Now close the child window it close the current window 
		dr.close();
		
		//Now cursor move to the parent window using parent window id
		dr.switchTo().window(parentwinid);
		
		String ptitle = dr.getTitle();
		
		System.out.println(ptitle);
		
		dr.close();
		
	}

}
