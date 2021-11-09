package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestive{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'From']\")")).sendKeys("Sydney");
//		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
//		from.sendKeys("Sydney");
//		Thread.sleep(2000);
//		from.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		from.sendKeys(Keys.ENTER);
		
	}
}