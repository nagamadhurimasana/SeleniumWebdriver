package Selenium.sampleproject.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopCategory {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Madhuri\\Selenium_WorkSpace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Browser
		driver.navigate().to("https://amazon.com");
		
	
		
		
	}

}
