package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form");
WebElement firstname = driver.findElement(By.id("firstName"));
firstname.sendKeys("Priya");
WebElement lastname = driver.findElement(By.id("lastName"));
lastname.sendKeys("M");
WebElement email = driver.findElement(By.className("mr-sm-2 form-control"));
email.sendKeys("priya@gmail.com");
WebElement gender = driver.findElement(By.className("custom-control-label"));
gender.click();
WebElement number = driver.findElement(By.id("userNumber"));
number.sendKeys("2469180");
WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
dob.clear();
dob.sendKeys("05 Oct 2005");
WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
subject.sendKeys("Selenium");
WebElement hobbies = driver.findElement(By.className("custom-control-label"));
hobbies.click();
WebElement address = driver.findElement(By.id("currentAddress"));
address.sendKeys("Anna Nagar");
WebElement state = driver.findElement(By.className(" css-1wa3eu0-placeholder"));
Select menu = new Select(state);
menu.selectByIndex(2);
WebElement submit = driver.findElement(By.id("submit"));
submit.click();

	}

}