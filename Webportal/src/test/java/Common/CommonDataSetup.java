package Common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	
	
	@BeforeSuite
	public void dataSetup() {
		System.out.println("Common datasetup");
	}
	
	@AfterSuite
	public void datatearDown() {
		System.out.println("Common data cleanup");
	}
}
