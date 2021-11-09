package UI;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportGenerator {
	
	
	
	@Test
	public void reporterTest1() {
		Reporter.log("This is test 1");	
		System.out.println("This is report generator 1");
	}
	
	@Test
	public void reporterTest2() {
		System.out.println("This is report generator 2");
	}
}
