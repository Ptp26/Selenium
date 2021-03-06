package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		//Print the title of the page
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		String script = " return document.title";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		//Click the button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid red'", button );
		
		//scroll
		driver.navigate().to("https://www.w3schools.com");
		WebElement started = driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/a"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);", started);
		
		
		

	}
}