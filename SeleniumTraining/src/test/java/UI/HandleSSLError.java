package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSLError{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability( CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions cm = new ChromeOptions();
		cm.merge(dc);
		WebDriver driver = new ChromeDriver(cm);
		driver.get("https://expired.badssl.com/");
		 
		
	}
}