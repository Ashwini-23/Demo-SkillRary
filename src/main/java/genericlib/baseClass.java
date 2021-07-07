package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver driver;
	public propertyfile p = new propertyfile();
	public WebDriverUtilities w = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws InterruptedException, IOException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void closeApp() {
		
		driver.quit();
		
	}

}
