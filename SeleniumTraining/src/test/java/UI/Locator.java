package UI;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
	
	public static String browser  = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		
		driver.get("http://www.saucedemo.com");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.get("https://www.selenium.dev");
		driver.findElement(By.linkText("Documentation")).click();
		driver.findElement(By.linkText("Getting Started")).click();
		
		
		driver.get("http://www.saucedemo.com");
		
	}

	

}
