package com.jcl.day9;

import java.io.FileWriter;
import java.io.IOException;

public class Day9_Q04 {
	/*
	 * 4. Write a program for writing to text file using char stream.
	 */
	public static void main(String[] args) {
		FileWriter writer = null;

		try {
			writer = new FileWriter("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q04 Write.txt");
			writer.write("Hello World!");
			System.out.println("Success!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
