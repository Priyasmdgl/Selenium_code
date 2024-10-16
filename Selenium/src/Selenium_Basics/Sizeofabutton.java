package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sizeofabutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement double_click_button = driver.findElement(By.id("doubleClickBtn"));
		int height=double_click_button.getSize().getHeight();
		int width=double_click_button.getSize().getWidth();
		System.out.println("Height is:"+height+"width is:"+width);
		
	}

}