package Wordpress;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
	@Test(dataProvider = "wordpressData")
	public void loginToWordPress( ) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Madhuri\\Selenium_WorkSpace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		try {
			driver.get("http://demosite.center/wordpress/wp-login.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			driver.findElement(By.id("user_login")).sendKeys("");
			driver.findElement(By.id("user_pass")).sendKeys("");
			driver.findElement(By.name("wp-submit")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@DataProvider(name="wordpressData")
	public Object[][] passData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin1";
		data[0][1] = "demo1";
		
		data[1][1] = "admin";
		data[1][1] = "demo123";
		
		return data;
				
		
	}

}
