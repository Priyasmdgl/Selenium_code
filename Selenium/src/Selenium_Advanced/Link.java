package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//navigate to url
driver.navigate().to("https://www.leafground.com/link.xhtml");
WebElement link = driver.findElement(By.linkText("Go to Dashboard"));
link.click();
//going back to the homepage
driver.navigate().back();
//finding the url without clicking the link
WebElement url = driver.findElement(By.partialLinkText("Find the URL"));
String actual_url= url.getAttribute("href");
System.out.println(actual_url);
//broken link
WebElement brokenlink=driver.findElement(By.linkText("Broken?"));
brokenlink.click();
String title=driver.getTitle();
if(title.contains("404")) {
	System.out.println("broken link");
}else {
	System.out.println("not broken");
}
driver.navigate().back();
//duplicate link
WebElement duplink = driver.findElement(By.linkText("Go to Dashboard"));
duplink.click();
driver.navigate().back();
//no.of links present in a page
List<WebElement> count=driver.findElements(By.tagName("a"));
int links=count.size();
System.out.println(links);
driver.quit();
	}

}