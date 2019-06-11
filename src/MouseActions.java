import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		WebElement category = driver.findElement(By.cssSelector("#nav-link-shopall > span.nav-line-2 > span"));
		action.moveToElement(category).build().perform();
		
//		WebElement echo = driver.findElement(By.cssSelector("#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span.nav-hasPanel.nav-item.nav-active > span"));
//		action.moveToElement(echo).build().perform();
//		System.out.println(driver.findElement(By.cssSelector("#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span.nav-hasPanel.nav-item.nav-active > span")).getTagName());
	}

}
