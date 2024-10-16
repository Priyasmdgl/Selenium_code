package Selenium_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		//to verify whether the image is broken or not
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/img[2]"));
		brokenimage.click();
		if(brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}
			else {
				System.out.println("The image is not broken");
			}
		}
		
	}
