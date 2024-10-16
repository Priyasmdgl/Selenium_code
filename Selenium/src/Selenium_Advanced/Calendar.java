package Selenium_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		//sendkey method
		WebElement calendar = driver.findElement(By.id("datePickerMonthYearInput"));
		calendar.clear();
		calendar.sendKeys("10/14/2024"+Keys.ENTER);
		//using calendar
		WebElement calendar1 = driver.findElement(By.id("datePickerMonthYearInput"));
		calendar1.click();
		WebElement next = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[2]"));
		next.click();
		WebElement date = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
		date.click();
		
	}

}