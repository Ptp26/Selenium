package com.test.readdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDatatoCSV2 {
	
	public static void main(String[] args) throws IOException {
		File fe = new File("A:\\Softwares\\Eclipse Projects\\ReadandWrite\\src\\com\\test\\properties\\TestText1.txt");
//		FileWriter fr = new FileWriter("A:\\Softwares\\Eclipse Projects\\ReadandWrite\\src\\com\\test\\properties\\TestText.txt");
		FileReader fr = new FileReader(fe);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
//		br.write("RCV online");
		br.close();
	}
	
}
