import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {

	@Test(priority=1)
	public void getTitle() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
		String title = driver.getTitle();
		System.out.println(title);
	
		
	}
	@Test(priority=2)
	public void getRegisterpage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("John");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Doe");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ptp26@njit.edu");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin_123");
		driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();
	}
	
}
