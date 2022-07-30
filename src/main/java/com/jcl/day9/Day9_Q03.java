package com.jcl.day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Day9_Q03 {
	/*
	 * 3. Write a program for reading text file using char stream.
	 */
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q03 Read.txt");
			writer = new FileWriter("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q03 Write.txt");
			int charRead = 0;
			
			
			  while ((charRead = reader.read()) != -1) { 
				  writer.write(charRead); 
				}
			 
			System.out.println("Success!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
