package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {

		googleSearch();

	}

	public static void googleSearch(){

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Go to google.com 
		driver.get("https://www.google.com");

		//Enter text in the search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		//Click on Search button 
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		WebElement element = driver.findElement(By.name("btnK"));
		element.submit();

		//Close Browser 
		driver.close();

		System.out.println("Test completed succesfully");
	}
}
