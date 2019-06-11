import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/RadioCheck.html");

		// Click radio buttons
		//driver.findElement(By.cssSelector("#female")).click();
		WebElement maleRadioButton = driver.findElement(By.cssSelector("#male"));
		maleRadioButton.click();
		
		// check checkboxes
		// Testcase is to check(click)/select Automation Testing checkbox
		if (!driver.findElement(By.cssSelector("#autoCheck")).isSelected()) {
			driver.findElement(By.cssSelector("#autoCheck")).click();
		}
		System.out.println("Automation testing is selected?: "+ driver.findElement(By.cssSelector("#autoCheck")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("#autoCheck")).isSelected());

	}

}
