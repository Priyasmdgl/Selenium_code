package Selenium_Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numberofwindowsopened {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		//storing a parent window
		String parent_window = driver.getWindowHandle();
		//storing new and parent window
		Set<String> windows=driver.getWindowHandles();
		for (String newwindow : windows) {
			driver.switchTo().window(newwindow);
		}
		//get the size of how much windows opened
		WebElement multiplewindow=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		multiplewindow.click();
		int windows_opened=driver.getWindowHandles().size();
		System.out.println(windows_opened);
	}

}