package Selenium_Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/window.xhtml");
//storing a parent window
String parent_window = driver.getWindowHandle();
WebElement open = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
open.click();
//storing new and parent window
Set<String> windows=driver.getWindowHandles();
for (String newwindow : windows) {
	driver.switchTo().window(newwindow);
}
//selecting an option in newwindow and close that and switch to parent window
WebElement settings =driver.findElement(By.xpath("//*[@id=\"layout-config-button\"]/i"));
settings.click();
driver.close();
driver.switchTo().window(parent_window);
//opening multiple windows and finding the no.of windows opened
WebElement multiplewindow=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
multiplewindow.click();
int windows_opened=driver.getWindowHandles().size();
System.out.println(windows_opened);
//opening windows and closing all the windows other than parent window
WebElement closewindow=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
closewindow.click();
//storing new and parent window
Set<String> windows1=driver.getWindowHandles();
for (String newwindows: windows1) 
	//closing all other windows other than parent window
{
	if(!newwindows.equals(parent_window)) {
		driver.switchTo().window(newwindows);
		driver.close();
	}
	}
driver.quit();
}
}