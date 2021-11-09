package UI;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataproviderDemo1 {
@DataProvider(name = "create")
	
	public Object[][] dataSet1(Method m) {
	
		Object[][] testdata = null;
		
		if(m.getName().equals("test"))
	
		
		return new Object[][] 
				{{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}};
		return testdata;
				
	}
	
}
