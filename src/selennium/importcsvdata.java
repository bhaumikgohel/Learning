package selennium;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class importcsvdata {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		System.setProperty("driver.chrome.driver", ".//chromedriver.exe");
		driver = new ChromeDriver();
		
		String title = driver.getTitle();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "Chrome");
		driver.get("https://www.traccar.org/port-check/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		
		sa.assertAll();
		
	}
	
	@DataProvider(name = "csvData")
    public Object[][] readDataFromCSV() throws IOException, CsvException {
        String csvFile = "D:\\Automation\\javaconcepts\\src\\data\\inputdata.csv"; // Provide the correct path to your CSV file

        CSVReader csvReader = new CSVReader(new FileReader(csvFile));
        List<String[]> data = csvReader.readAll();

        // Convert List<String[]> to Object[][]
        Object[][] dataArray = new Object[data.size()][2];

        for (int i = 0; i < data.size(); i++) {
            dataArray[i] = data.get(i);
        }

        return dataArray;
    }

    @Test(dataProvider = "csvData")
    public void testLogin(String id, String password, WebElement inputid, WebElement port) {
      
    	System.out.println("test data csv");
}
	 
}
