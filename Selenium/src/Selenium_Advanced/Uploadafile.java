package Selenium_Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadafile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement choose = driver.findElement(By.xpath("//*[@id=\"j_idt97:j_idt98_label\"]"));
		choose.click();
		//storing the path of the file which we want to upload 
		//String file = "C:\\Users\\HP\\Downloads\\TestLeaf Logo.png";
		//setting the file path using string selection and setting the file content from clipboard to toolkit
		StringSelection select = new StringSelection("C:\\Users\\HP\\Downloads\\TestLeaf Logo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		//paste the path and press enter
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}