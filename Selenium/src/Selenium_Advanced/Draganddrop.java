package Selenium_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		WebElement drop = driver.findElement(By.id("form:drop_content"));
		Actions dd = new Actions(driver);
		//dd.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		//or we can use the below one
		dd.dragAndDrop(drag, drop).build().perform();
		
	}

}