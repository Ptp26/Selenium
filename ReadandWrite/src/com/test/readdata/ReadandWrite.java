package com.test.readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadandWrite {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("A:\\Softwares\\Eclipse Projects\\ReadandWrite\\src\\com\\test\\properties\\TestData.properties");
		//Step 1 create an object of the file reader class
		//Step2 Create an object of properties class
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\test\\properties\\TestData.properties");
		Properties p = new Properties();
		//load the file
		p.load(fi);
		
		//Step 4 use the get property method
		System.out.println(p.getProperty("age"));
	}

}
