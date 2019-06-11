import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		
		WebElement fname = driver.findElement(By.cssSelector("#fname"));
		WebElement lname = driver.findElement(By.cssSelector("#lname"));
		WebElement button = driver.findElement(By.cssSelector("#idOfButton"));
		
		//Iterate this
		//{
		//for all records in data file
		highlightInteraction(driver, fname);
		//fname.sendKeys(first_name_data);
		fname.sendKeys("Gaurav");
		
		highlightInteraction(driver, lname);
		lname.sendKeys("Lad");
		
		highlightInteraction(driver, button);
		button.click();
		//}
	}
	
	public static void highlightInteraction(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);
		
	}

}
