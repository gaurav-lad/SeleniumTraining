import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AjaxAndWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//IMPLICIT WAIT
		//Implicit Wait on driver applicable for all elements operation 
		//It immediately check for element, resumes execution if found
		//If not found, it will wait for specified time, and then check again
		//If found, resumes execution, if not, give "NoSuchElementException"
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//EXPLICIT WAIT
		//It immediately check for expected condition to get satisfied
		//If so, next statement execution resumes, if not
		//Will poll the expected condition every 500 milliseconds
		//and will come out of wait if found any time before the total duration of wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		WebElement promptAlertButton = driver.findElement(By.cssSelector("body > div > div:nth-child(27) > div > p:nth-child(1) > button"));
		promptAlertButton.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Simple Alert text: "+ alert.getText());
		String promptAlertSendKeys = "Gaurav";
		alert.sendKeys(promptAlertSendKeys);
		alert.accept();

		WebElement promptTextExplicit = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#demoPrompt")));
		
		String promtAlertReply = promptTextExplicit.getText();
		
		System.out.println(promtAlertReply);
		Assert.assertEquals(promtAlertReply, "Hello " + promptAlertSendKeys + "! How are you today?");	
	}
}
