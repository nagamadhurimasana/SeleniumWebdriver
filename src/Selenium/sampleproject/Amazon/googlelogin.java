package Selenium.sampleproject.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googlelogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Madhuri\\Selenium_WorkSpace\\SeleniumProject\\Driver\\chromedriver.exe");
		//Open the browser
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MICROSECONDS);
		driver.navigate().to("http://google.com");
		//Maximize Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("nagamadhuri.masana@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"vn1s0p1c0\"]/h3/span")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone11");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage-announce\"]")).click();
		Thread.sleep(2000);

		//public class clicknothanks() {
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		



		
		
	}

}
