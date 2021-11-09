package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelements{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
	
//		driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).sendKeys("Testing");
//		driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).clear();
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		
//		
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")));
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).getCssValue("text-transfrom"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/inputl")).isSelected());
	}
}