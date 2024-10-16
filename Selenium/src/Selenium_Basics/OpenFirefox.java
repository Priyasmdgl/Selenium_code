package Selenium_Basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://www.google.co.in");
driver.quit();
	}

}