package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

/*
 * This is another way of opening the Google page, searching something and clicking ok
 */

public class GoogleSearchTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {

		googleSearch();

	}

	public static void googleSearch(){

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		//Go to google.com 
		driver.get("https://www.google.com");

		//Enter text in the search text box
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");;

		//Click on Search button 
		GoogleSearchPage.button_search(driver).submit();
		
		//Close Browser 
		driver.close();

		System.out.println("Test completed succesfully");
	}
}
