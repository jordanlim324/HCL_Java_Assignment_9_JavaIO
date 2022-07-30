package com.jcl.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Day9_Q05 {
	/*
	 * 5. Write a program for BufferedReader and BufferedWriter.
	 */
	public static void main(String[] args) {

		BufferedReader buffRead = null;
		BufferedWriter buffWrite = null;
		
		try {
			Reader reader = new FileReader("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q05 Read.txt");
			buffRead = new BufferedReader(reader);
			String line = null;
			
			File output = new File("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q05 Write.txt");
			Writer writer = new FileWriter(output);
			buffWrite = new BufferedWriter(writer);
			
			while((line = buffRead.readLine()) != null) {
				buffWrite.write(line);
				buffWrite.flush();
			}
			System.out.println("Success!");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				buffRead.close();
				buffWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
