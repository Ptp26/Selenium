package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id = \"gh-ac\"]")).sendKeys("keyboards");
		driver.findElement(By.xpath("//*[@id = \"gh-btn\"]")).click();
//		driver.close();
		
		
	}
}