package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//click and accept an alert
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement alertbox=driver.findElement(By.id("alertButton"));
		alertbox.click();
		org.openqa.selenium.Alert button = driver.switchTo().alert();
		Thread.sleep(2000);
		button.accept();
		//cancel an alert
		WebElement confirmbox=driver.findElement(By.id("confirmButton"));
		confirmbox.click();
		org.openqa.selenium.Alert confirmbutton =driver.switchTo().alert();
		Thread.sleep(1000);
		confirmbutton.dismiss();
		//prompt box
		WebElement promptbox=driver.findElement(By.id("promtButton"));
		promptbox.click();
		org.openqa.selenium.Alert promptbutton=driver.switchTo().alert();
		Thread.sleep(1000);
		promptbutton.sendKeys("Priya");
		promptbutton.accept();
	}

}