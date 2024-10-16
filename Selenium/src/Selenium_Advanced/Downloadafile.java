package Selenium_Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/file.xhtml");
WebElement download = driver.findElement(By.id("j_idt93:j_idt95"));
download.click();
//to check whether the downloaded file exists in downloads
//setting the path where the file is downloaded
File location = new File("C:\\Users\\HP\\Downloads");
//storing all the files in a list which is present in downloads
File[] allfiles= location.listFiles();
//checking each file name with the file name which we downloaded
for (File file : allfiles) {
	if(file.getName().equals("TestLeaf Logo.png")) {
		System.out.println("File is downloaded");
		break;
	}
}
driver.quit();
	}

}