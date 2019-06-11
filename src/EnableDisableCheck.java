import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/EnableDisable.html");

		//by default it is enabled, return TRUE
		System.out.println(driver.findElement(By.cssSelector("#name")).isEnabled());
		//disabeling it
		driver.findElement(By.cssSelector("body > button:nth-child(3)")).click();
		//Disabled so return FALSE
		System.out.println(driver.findElement(By.cssSelector("#name")).isEnabled());
		//clicking on enabeling button
		driver.findElement(By.cssSelector("body > button:nth-child(4)")).click();
		//return TRUE because now text field is enabled
		System.out.println(driver.findElement(By.cssSelector("#name")).isEnabled());
		
		
		
		driver.close();
	}

}
