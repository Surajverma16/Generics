package org.suraj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File directory = new File("c:\\Suraj\\java");
		directory.mkdirs();
		
		File file = new File("c:\\Suraj\\java\\text.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		System.out.println("New File created");

		try {
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(file,true));
			bWriter.write("Suraj");
			bWriter.newLine();
			bWriter.write("Nikunj");
			bWriter.newLine();
			bWriter.write("Meet");
			bWriter.newLine();
			bWriter.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String lineString;
			while((lineString = bufferedReader.readLine()) != null) {
				System.out.println(lineString);
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
	}
}
