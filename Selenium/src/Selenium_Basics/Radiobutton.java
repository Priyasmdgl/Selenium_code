package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		//click a radio button
		WebElement radio_button=driver.findElement(By.className("custom-control-label"));
		radio_button.click();
		//to check whether the radio button is selected or not
		WebElement yes_button=driver.findElement(By.className("custom-control-label"));
		Boolean status=yes_button.isSelected();
		System.out.println(status);
	}

}