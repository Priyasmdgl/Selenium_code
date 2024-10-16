package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/list.xhtml");
List<WebElement> sortable = driver.findElements(By.xpath("//*[@id=\"j_idt111\"]/div/div[2]/ul/li"));
int size=sortable.size();
System.out.println(size);
//storing the from and to element
WebElement fromElement=sortable.get(6);
WebElement toElement=sortable.get(0);
Actions actions = new Actions(driver);
//moving the from element to the to element
actions.clickAndHold(fromElement);
actions.clickAndHold(toElement);
actions.release(toElement);
actions.build().perform();
	}

}