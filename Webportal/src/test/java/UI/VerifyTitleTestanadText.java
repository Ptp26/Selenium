package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTestanadText {
	
	@Test
	public void titletest() {
		
		SoftAssert softassert = new SoftAssert();
		String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String text = "Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		
		String actualtitle = driver.getTitle();
		System.out.println("This test is the title verification");
		softassert.assertEquals(actualtitle, title , "Title verification failed");
		System.out.println("This test is the text verification");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(actualtext, text, "Text verification failed");
		System.out.println("Closing the  browser");
		driver.close();
		softassert.assertAll();
		
	}

}
