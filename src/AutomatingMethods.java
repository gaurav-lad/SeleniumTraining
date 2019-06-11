import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		
		System.out.println("Current page URL is: " + driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println();
		System.out.println("Title of page: "+ driver.getTitle());
		System.out.println("Get text method: " + driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div")).getText());
		
		//getAttribute
		//finding element, and then, ask which attributes value you/we want
		System.out.println(driver.findElement(By.cssSelector("body > div > div:nth-child(6) > div > p > a")).getAttribute("href"));
		

//		driver.findElement(By.cssSelector("#idOfButton")).submit();	
		driver.findElement(By.id("idOfButton")).click();
		
		driver.close();
		
	}

}
