package Selenium.sampleproject.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchBrowser {
	
	//public static WebDriver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Madhuri\\Selenium_WorkSpace\\SeleniumProject\\Driver\\chromedriver.exe");
		//Open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MICROSECONDS);
		driver.navigate().to("https://amazon.in");
		//Maximize Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Get title
		String title = driver.getTitle();
		//System.out.println(title);
		
		//Comparing the Title of the browser/driver
		/*if (title.equalsIgnoreCase("amazon.in"))
			System.out.println("Title Matches");
		else 
			System.out.println(title);
			System.out.println("Title Mismatches"); */
		
		//Locate a Web element
		String Catgname = " ";
		Catgname =driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2")).getText();
		Thread.sleep(2000);
		System.out.println(Catgname);
		
		//
		WebElement Signin = driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-1"));
		Actions action = new Actions(driver);
		action.moveToElement(Signin);
		action.click();
		action.perform();
		Thread.sleep(2000);
		
		//
		//Login Screen
		
		WebElement Email = driver.findElement(By.id("ap_email"));
		System.out.println(Email);
		action.moveToElement(Email);
		action.sendKeys(Email,"pearl.kranthi@gmail.com");
		Thread.sleep(2000);

		//String Continue = driver.findElement(By.cssSelector("#continue")).getText();
		
		
		
			
			
	}

}
