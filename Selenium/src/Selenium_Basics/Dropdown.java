package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		//select by index,text,sendkeys
	    WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]/div[1]"));
	    Select menu = new Select(dropdown);
	    menu.selectByIndex(2);
	    menu.selectByVisibleText("Ms.");
	    dropdown.sendKeys("Ms.");
	    //multiselect
	   WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]"));
	   Select box=new Select(multiselect);
	   box.selectByIndex(0);
	   box.selectByIndex(1);
	   box.selectByIndex(2);
	    
		
	}

}