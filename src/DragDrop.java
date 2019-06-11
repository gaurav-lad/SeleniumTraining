import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.get("http://jqueryui.com/droppable/");
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

//		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("count of iframes in dom: " +size);
//		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
	}

}
