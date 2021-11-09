package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDropdown{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("select"));
		
		System.out.println("Total tags are : " +alltags.size());
		
		for(int i = 0; i< alltags.size() ; i++ ) {
			System.out.println("Links on the page are" + alltags.get(i).getAttribute("href"));
			System.out.println("Links on the page are" +alltags.get(i).getText());
		}
		
//		WebElement ddown = driver.findElement(By.name("employees_c"));
//		Select select = new Select(ddown);
//		
//		select.selectByValue("level1");
//		Thread.sleep(2000);
//		
//		select.selectByIndex(5);
//		Thread.sleep(2000); 
//		
//		select.selectByVisibleText("51 - 100 employees");
		
		
		// multiselect option in dropdown list
	}
}