import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class HeadlessChrome {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
			
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		
		WebElement title = driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div"));
		System.out.println(title.getText());
		screenshots();

	}
	
	public static void screenshots() throws IOException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("C:\\Users\\Gaurav\\Desktop\\Selenium\\" + System.currentTimeMillis() + "testScreenshot.png"));
	}

}
