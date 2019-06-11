import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;

import com.google.common.io.Files;

public class TakingSceenshots {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");


		driver.get("https://www.amazon.in/");
		
//		screenshots();
		
		Actions action = new Actions(driver);
		WebElement category = driver.findElement(By.cssSelector("#nav-link-shopall > span.nav-line-2 > span"));
		action.moveToElement(category).build().perform();

//		screenshots();
		
		try {
		WebElement echo = driver.findElement(By.cssSelector("#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span.nav-hasPanel.nav-item.nav-active > span"));
		action.moveToElement(echo).build().perform();
		}
		catch(Exception e) {
			screenshots();
			System.out.println("Exception");
		}
//		screenshots();
	}
	
	public static void screenshots() throws IOException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("C:\\Users\\Gaurav\\Desktop\\Selenium\\" + System.currentTimeMillis() + "testScreenshot.png"));
	}

}
