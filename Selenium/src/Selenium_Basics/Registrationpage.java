package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/register");
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Priya");
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("M");
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("priyam");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin@123");
		WebElement checkbox = driver.findElement(By.id("recaptcha-anchor-label"));
		checkbox.click();
		WebElement register = driver.findElement(By.id("register"));
		register.click();
		
	}

}