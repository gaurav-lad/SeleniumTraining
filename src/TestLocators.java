import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//open browser and navigate to given URL and wait for page to load completely
		driver.get("https://stackoverflow.com/");

		
		driver.findElement(By.xpath("/html/body/header/div/ol/li[6]/a[2]")).click();
		//sendKeys("xyz");
		String dynamicXpath = "@name='inline-display-name']";
		driver.findElement(By.xpath("//*[@id='display-name' and " + dynamicXpath +"]")).sendKeys("Xpath ANDs");
		//IDs
		//finding element by id and click on it
		/*
		 * driver.findElement(By.id("display-name")).click();
		 * 
		 * //finding element by id and sending text to it
		 * driver.findElement(By.id("display-name")).sendKeys("TestSelenium");
		 * 
		 * //NAMEs //finding element by name and sending text to it
		 * driver.findElement(By.name("q")).sendKeys("Selenium");
		 * 
		 * //ClassNames //finding element by className and click on it
		 * driver.findElement(By.className("-main")).click();
		 * 
		 * //XPATHs //finding element by xpath and click on it
		 * driver.findElement(By.xpath("/html/body/header/div/ol/li[6]/a[2]")).click();
		 * 
		 * driver.findElement(By.className("-main")).click();
		 * 
		 * //finding element by relative xpath and sending text to it
		 * driver.findElement(By.xpath("//*[@id=\"display-name\"]")).
		 * sendKeys("relative xpath");
		 * 
		 * //finding element by relative xpath and clearing text to it
		 * driver.findElement(By.xpath("//*[contains(@id,'display-name')]")).clear();
		 * 
		 * //finding element by relative xpath with contains function and sending text
		 * to it driver.findElement(By.xpath("//*[contains(@id,'display-name')]")).
		 * sendKeys("Xpath Contains");
		 * 
		 * driver.findElement(By.xpath("//*[contains(@id,'display-name')]")).clear();
		 * 
		 * //finding element by relative xpath with OR & sending text to it
		 * driver.findElement(By.
		 * xpath("//*[@id='display-name' or @name='inline-display-name']")).
		 * sendKeys("Xpath ORs");
		 * driver.findElement(By.xpath("//*[contains(@id,'display-name')]")).clear();
		 * 
		 * //finding element by relative xpath with AND & sending text to it
		 * driver.findElement(By.
		 * xpath("//*[@id='display-name' and @name='inline-display-name']")).
		 * sendKeys("Xpath ANDs");
		 * 
		 * //finding element by relative xpath with starts-with function and clearing
		 * text to it
		 * driver.findElement(By.xpath("//*[starts-with(@id,'display')]")).clear();
		 * 
		 * //finding element by relative xpath with starts-with function and sending
		 * text to it driver.findElement(By.xpath("//*[starts-with(@id,'display')]")).
		 * sendKeys("xpath Starts with");
		 * 
		 * //finding element by relative xpath with text function and getting text from
		 * it //String text = driver.findElement(By.xpath(" ")).getText();
		 * //System.out.println(text);
		 * 
		 * //Xpath Axes
		 * 
		 * System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\"se-login-fields\"]//following::label")).getText());
		 * System.out.println(); //WebElement element = (WebElement)
		 * driver.findElements(By.xpath(
		 * "//*[@id=\"se-login-fields\"]/div[4]//preceding::label"));
		 * System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\"se-login-fields\"]/div[4]//preceding::label")).getText());
		 * 
		 * System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\"se-login-fields\"]/div[4]//following-sibling::small")).getText());
		 */
		//CSS Selectors
		//Tag and ID
		WebElement element = driver.findElement(By.cssSelector("#display-name"));//.sendKeys("CSS ID");
		element.sendKeys("CSS ID");
		driver.findElement(By.cssSelector("#display-name")).clear();
		
		driver.findElement(By.cssSelector("#display-name.f-input")).sendKeys("CSS ID and Class name");
		driver.findElement(By.cssSelector("#display-name")).clear();
		
		driver.findElement((By.cssSelector("input[name='inline-display-name']"))).sendKeys("CSS Tag and Attributes");
		driver.findElement(By.cssSelector("#display-name")).clear();

		driver.findElement((By.cssSelector("input.f-input[name=\'inline-display-name\']"))).sendKeys("tag, class, attribute");
		driver.findElement(By.cssSelector("#display-name")).clear();
		
		driver.findElement((By.cssSelector("input[name^=\'inline-display\']"))).sendKeys("Starts with css");
		
		driver.findElement(By.cssSelector("#display-name")).clear();
		driver.findElement((By.cssSelector("input[name$=\'display-name\']"))).sendKeys("Ends with css");
		
		driver.findElement(By.cssSelector("#display-name")).clear();
		driver.findElement((By.cssSelector("input[name*=\'-display-\']"))).sendKeys("contains with css");
		
		
	}

}