import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		
		WebElement simpleAlertButton = driver.findElement(By.cssSelector("body > div > div:nth-child(22) > div > p > button"));
		WebElement confirmAlertButton = driver.findElement(By.cssSelector("body > div > div:nth-child(24) > div > p:nth-child(1) > button"));
		WebElement promptAlertButton = driver.findElement(By.cssSelector("body > div > div:nth-child(27) > div > p:nth-child(1) > button"));
		
		//SIMPLE ALERT
		simpleAlertButton.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Simple Alert text: "+ alert.getText());
		alert.accept();
		
		//CONFIRM ALERT
		confirmAlertButton.click();
		alert = driver.switchTo().alert();
		System.out.println("Simple Alert text: "+ alert.getText());
		alert.dismiss();
		WebElement element = driver.findElement(By.cssSelector("#demo"));
		String confirmAlertReply = element.getText();
		System.out.println("Confrim alert reply is: "+ confirmAlertReply);
		Assert.assertEquals(confirmAlertReply, "You pressed Cancel!");
		
		confirmAlertButton.click();
		alert = driver.switchTo().alert();
		System.out.println("Simple Alert text: "+ alert.getText());
		alert.accept();
		String confirmAlertAcceptReply = element.getText();
		System.out.println("Confrim alert reply is: "+ confirmAlertAcceptReply);
		Assert.assertEquals(confirmAlertAcceptReply, "You pressed OK!");

		//PROMPT ALERT
		promptAlertButton.click();
		alert = driver.switchTo().alert();
		System.out.println("Simple Alert text: "+ alert.getText());
		String promptAlertSendKeys = "Gaurav";
		alert.sendKeys(promptAlertSendKeys);
		alert.accept();
		String promtAlertReply = driver.findElement(By.cssSelector("#demoPrompt")).getText();
		System.out.println(promtAlertReply);
		Assert.assertEquals(promtAlertReply, "Hello " + promptAlertSendKeys + "! How are you today?");
		
		driver.close();
	}
}
