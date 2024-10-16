package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/selectable");
//storing the elements in a list
List<WebElement> selection = driver.findElements(By.xpath("//*[@id=\"verticalListContainer\"]/li"));
int size=selection.size();
System.out.println(size);
Actions selectable = new Actions(driver);
//pressing control and selecting indexes
selectable.keyDown(Keys.CONTROL).click(selection.get(0)).click(selection.get(1)).build().perform();
//we can also use the below method
Actions actions = new Actions(driver);
actions.clickAndHold(selection.get(0));
actions.clickAndHold(selection.get(1));
actions.build().perform();
	}

}