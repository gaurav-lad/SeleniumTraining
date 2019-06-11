import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class TestingOnHeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		
		System.setProperty("phantomjs.binary.path", "C:\\Program Files\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		
		WebElement fname = driver.findElement(By.cssSelector("#fname"));
		fname.sendKeys("Test");
		
		WebElement title = driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div"));
		System.out.println(title.getText());
	}

}
