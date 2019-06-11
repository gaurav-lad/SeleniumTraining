import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetAllURLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/link.html");

		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		//Actions class to perform keyboard interaction through Selenium on Web element
		Actions builder = new Actions(driver);
		
		Iterator<WebElement> iterator = li.iterator();
		while(iterator.hasNext()) {
			for(WebElement anchors : li) {
				WebElement webelement = iterator.next();
				//Checking href have http as value and not any local or image path
				if(webelement.getAttribute("href").contains("http")) {
					//performing web element actions
					builder.keyDown(Keys.CONTROL).perform();
					anchors.click();
					builder.keyUp(Keys.CONTROL).perform();
				}
			}
		}
		driver.quit();
	}

}
