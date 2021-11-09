package UI;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a")).click();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement resize = driver.findElement(By.id("resizable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
//		
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 300, 230).perform();
	}
}