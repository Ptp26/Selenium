package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skiptestcase {
	
	Boolean datasetup = true;
	
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test case");
	}
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test case forcefully");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test case base on condition");
		if(datasetup = true) {
			System.out.println("Execute this test");
		}
		else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
		
	}


}
