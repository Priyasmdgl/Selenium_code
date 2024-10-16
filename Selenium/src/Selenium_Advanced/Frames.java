package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/frame.xhtml");
//switching to a frame
driver.switchTo().frame(0);
WebElement frame = driver.findElement(By.id("Click"));
frame.click();
//retrieving the displayed text after clicking the frame
String text= frame.getText();
System.out.println(text);
driver.switchTo().frame(0);
//switching to nested frame
driver.switchTo().frame(1);
driver.switchTo().frame("frame2");
WebElement nested_frame = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
nested_frame.click();
String result=nested_frame.getText();
System.out.println(result);
driver.switchTo().frame(0);
//retrieve the number of frames in a page
List<WebElement> total_frames=driver.findElements(By.tagName("iframe")); 
int number=total_frames.size();
System.out.println(number);
	}

}