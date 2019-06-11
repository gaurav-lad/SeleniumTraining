import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium/Test.html");
		
		WebElement element = driver.findElement(By.cssSelector("#testingDropdown"));
		//Select using selectByIndex, selectByValue, SelectByVisisbleText
		Select select = new Select(element);
		select.selectByIndex(2);
		select.selectByValue("Database");
		//Check if select list is multi select or not
		System.out.println("Is select list is a multiple or not? " +select.isMultiple());
		select.selectByVisibleText("Performance Testing");
		
		//Listing all the options in select tag
		List<WebElement> selectOptions = select.getOptions();
		int size = selectOptions.size();
		System.out.println("Size of list: " + size);
		for(int i=0; i<size ;i++) {
			//Getting text from the list of select options
			System.out.println(selectOptions.get(i).getText());
		}
		
		WebElement multiselectWE = driver.findElement(By.cssSelector("#Browsers"));
		Select multiSelect = new Select(multiselectWE);
		System.out.println("isMultiple or not? " + multiSelect.isMultiple());
		
		//Doing multiselect options on multiselect options using different ways of selecting like, selectByIndex, selectByValue, SelectByVisisbleText
		multiSelect.selectByIndex(2);
		//multiSelect.selectByIndex(3);
		multiSelect.selectByValue("MS");
		multiSelect.selectByVisibleText("Mozilla Firefox");
		
		//Deselecting perticular option
		multiSelect.deselectByIndex(3);
		multiSelect.deselectByValue("Microsoft");
		multiSelect.deselectByVisibleText("Mozilla Firefox");
		
		//Deselecting all from multiselect list
		multiSelect.deselectAll();
		
		driver.close();
	}

}
