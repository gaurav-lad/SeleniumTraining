import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertsChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		String heading = driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div")).getText();
		//Asserts
		Assert.assertEquals(heading, "Sample WebPage for Automation Testing");
		System.out.println("AssertEquals executed successfully!!!");
		Assert.assertNotEquals(heading, "Sample WebPage for Manual Testing");
		System.out.println("AssertNotEquals executed successfully!!!");
		Assert.assertNotNull(heading);
		System.out.println("AssertNotNull executed successfully!!!");
		
		//Asserts and isSelected()
		System.out.println(driver.findElement(By.cssSelector("#male")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("#male")).isSelected());
		System.out.println("AssertTrue executed successfully!!!");
		Assert.assertFalse(driver.findElement(By.cssSelector("#female")).isSelected());
		System.out.println("AssertFalse executed successfully!!!");
		
		//Soft Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(heading, "Sample WebPage for Manual Testing");
		System.out.println("Soft Asserts assertEquals caught an error, still executed next statement successfully!!!");
		
		driver.close();
	}

}
