package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest(){
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch(){
		//Go to google.com 
		driver.get("https://www.google.com");

		//Enter text in the search text box
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		WebElement element = driver.findElement(By.name("btnK"));
		element.submit();
	}

	@AfterTest
	public void tearDownTest(){
		//Close Browser 
		driver.close();
		System.out.println("Test completed succesfully");
	}
}
