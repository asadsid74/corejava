package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:/Users/hp/OneDrive/Desktop/javaText.txt");
	 
	        BufferedReader br = new BufferedReader(new FileReader(file));
	 
	        String st;
	        while ((st = br.readLine()) != null)
	 
	            System.out.println(st);
	  br.close();
}

}
