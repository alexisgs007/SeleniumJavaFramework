package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	static WebElement element = null;
	
	//Method to find the Search text box
	public static WebElement textbox_search(WebDriver driver){
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	//Method to find the Search button 
	public static WebElement button_search(WebDriver driver){
		
		element = driver.findElement(By.name("btnK"));
		return element;
		
	}
	
}
