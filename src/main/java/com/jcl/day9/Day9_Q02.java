package com.jcl.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day9_Q02 {
	/*
	 * 2. Write a program for writing binary data into a file
	 */
	public static void main(String[] args) {
		FileInputStream source = null;
		FileOutputStream target = null;
		int temp = 0;
		
		try {
			try {
				source = new FileInputStream("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q02 Food.png");
				target = new FileOutputStream("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q02 Hamburger.png");
				
				while ((temp = source.read()) != -1) {
					target.write((byte) temp);
				}
				System.out.println("Success!");
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} finally {
			try {
				//if (source != null) {
				//	source.close();
				//}
				if (target != null) {
					target.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
