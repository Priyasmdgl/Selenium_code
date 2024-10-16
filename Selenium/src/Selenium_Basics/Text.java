package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/text-box");
driver.findElement(By.id("userName")).sendKeys("Priya");
driver.findElement(By.id("userEmail")).sendKeys("priya@gmail.com");
driver.findElement(By.id("currentAddress")).sendKeys("Dindigul");
driver.findElement(By.id("permanentAddress")).sendKeys("Dindigul");
driver.findElement(By.id("submit")).click();

	}

}