package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/login");
WebElement username = driver.findElement(By.id("userName"));
username.sendKeys("priyam");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("Priya@123");
WebElement login = driver.findElement(By.id("login"));
login.click();
	}

}
