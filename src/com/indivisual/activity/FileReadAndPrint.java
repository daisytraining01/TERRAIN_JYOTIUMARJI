package com.indivisual.activity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAndPrint {
	public static void main(String[] args) throws IOException {

		String  s="C:\\Users\\User\\Desktop\\test1.txt";
		FileReader reader = new FileReader(new File(s));
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line;
		int lineNumber=0;

		while ((line = bufferedReader.readLine()) != null) {
			
			 if ( lineNumber % 2 == 0 ) {
				 System.out.println(line);
			 }
			 lineNumber++;
		}

		reader.close();

	}
}