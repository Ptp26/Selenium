package UI;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBinddings{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();

		
		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre/span"));
//		driver.switchTo().frame(frame);
//		
//		 WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
	
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourcetextarea,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
	WebElement destination = 	driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre"));
	action.keyDown(destination,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}
}