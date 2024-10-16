package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("http://www.google.co.in");
driver.quit();
	}

}