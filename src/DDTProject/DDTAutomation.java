package DDTProject;
//import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTAutomation {
	
	WebDriver driver = new ChromeDriver();

	@Test(dataProvider ="testdata")
	public void Demo(String username, String password) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Madhuri\\Selenium_WorkSpace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

	}

	@ DataProvider(name = "testdata")
	public Object[][] Testdatafeed()
	{
		ReadExcelFile config = new ReadExcelFile ("F:\\Madhuri\\Selenium_WorkSpace\\Data\\Datasheet.xls");
		int rows = config.getRowCount(0);
		Object[][] credentials = new Object [rows][2];
		for (int i=0; i<rows; i++) {
			credentials[i][0] =config.getData(0, i , 0);
			credentials[i][1] = config.getData(0, i, 1);
		}
		
		return credentials;
		
	}
	
}
	
	
	

