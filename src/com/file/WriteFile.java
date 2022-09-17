package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

	public static void main(String[] args) throws IOException {

		String text = "Method 1: Using writeString() method\r\n"
				+ "This method is supported by Java version 11. This method can take four parameters. These are file path, character sequence, charset, and options. The first two parameters are mandatory for this method to write into a file. It writes the characters as the content of the file. It returns the file path and can throw four types of exceptions. It is better to use when the content of the file is short.\r\n"
				+ "\r\n"
				+ "Example: It shows the use of the writeString() method that is under the Files class to write data into a file. Another class, Path, is used to assign the filename with a path where the content will be written. Files class has another method named readString() to read the content of any existing file that is used in the code to check the content is properly written in the file.";

		Path fileName = Path.of("C:\\Users\\hp\\OneDrive\\Desktop\\sakib.xlsx");

		Files.writeString(fileName, text);

	}

}
