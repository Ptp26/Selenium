package UI;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupDemoTest {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this method before class");
	}
	
	
	
	@BeforeTest
	public void logintoapplication() {
		System.out.println("We are login in to the application");
	}
	

	@AfterTest
	public void logouttoapplication() {
		System.out.println("We are loggingout in to the application");
	}
	
	@Test(priority = 1,description = "This is a test for login")
	public void logintest() {
		System.out.println("Login is Successful");
	}
	
	@BeforeMethod
	public void connectToDb() {
		System.out.println("DB connected");
	}
	
	@AfterMethod
	public void disconnectToDb() {
		System.out.println("DB disconnected");
	}
	
	
	@AfterClass
	public void AfterClass1() {
		System.out.println("Run this method after class");
	}
	
	
	@Test(priority = 2, description = "This is a test for login")
	public void logout() {
		System.out.println("Logout is successful");
	}
	
	
}
