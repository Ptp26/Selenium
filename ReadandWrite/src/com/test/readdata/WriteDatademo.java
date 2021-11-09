package com.test.readdata;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDatademo {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("A:\\Softwares\\Eclipse Projects\\ReadandWrite\\src\\com\\test\\properties\\TestData.properties");
		//Step 1 create an object of the file reader class
		//Step2 Create an object of properties class
//		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\test\\properties\\TestData.properties");
		Properties p = new Properties();
		//load the file
		
		
		//Step 4 use the get property method
		p.setProperty("salary", "100000");
		p.store(fr, "Sample comments");
	}


}
