package com.test.readdata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoCSV {
	
	public static void main(String[] args) throws IOException {
		File fe = new File("A:\\Softwares\\Eclipse Projects\\ReadandWrite\\src\\com\\test\\properties\\TestText1.csv");
//		FileWriter fr = new FileWriter("A:\\Softwares\\Eclipse Projects\\ReadandWrite\\src\\com\\test\\properties\\TestText.txt");
		FileWriter fr = new FileWriter(fe,true);
		BufferedWriter br = new BufferedWriter(fr);
		
		for(int i = 1 ; i<10 ; i++) {
			br.write("RCV academy online " + ",");
			System.out.println("Success");
		}
//		br.write("RCV online");
		br.close();
	}
	
}
