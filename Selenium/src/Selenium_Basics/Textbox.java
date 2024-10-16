package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append a text
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/input.xhtml");
WebElement appendbox = driver.findElement(By.id("j_idt88:j_idt91"));
appendbox.clear();
appendbox.sendKeys("Dindigul");
//verify whether the text box is disabled
WebElement disable =  driver.findElement(By.className("col-12"));
boolean status = disable.isEnabled();
System.out.println("Status is:"+status);
WebElement clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
clearbox.clear();
WebElement box = driver.findElement(By.id("j_idt88:j_idt97"));
String value = box.getAttribute("value");
System.out.println(value);
	}

}