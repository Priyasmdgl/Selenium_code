package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		//finding an element and sending the first letter of the color
		WebElement box = driver.findElement(By.id("autoCompleteMultipleContainer"));
		box.sendKeys("G");
		Thread.sleep(2000);
		//storing the colors in a list
		List<WebElement> colors=driver.findElements(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]/li"));
		//checking the available options with a letter starting with G
		for (WebElement webElement : colors) {
			if(webElement.getText().equals("Green")) {
				webElement.click();
				break;
			}
		}
	}

}