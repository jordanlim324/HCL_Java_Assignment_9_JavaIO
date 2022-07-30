package com.jcl.day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Day9_Q06 {
	/*
	 * 6. Create an object, serialize it, and store it in a file or database.
	 */
	public static void main(String[] args) {

		Attendee a1 = new Attendee("A15435", "Santa", "Claus");

		FileOutputStream fileOS = null;
		ObjectOutputStream objOS = null;

		try {
			fileOS = new FileOutputStream("C:\\Users\\jordan.lim\\Documents\\Java IO Files\\Q06.txt");
			objOS = new ObjectOutputStream(fileOS);
			objOS.writeObject(a1);
			System.out.println("Success!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOS.close();
				objOS.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}

	}
}

class Attendee implements Serializable {
	
	private static final long serialVersionUID = 0001L;
	
	private transient String Attendeeid;
	
	private String firstName;
	
	private String lastName;
	
	public Attendee(String Attendeeid, String firstName, String lastName) {
		this.Attendeeid = Attendeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public String getAttendeeid() {
		return Attendeeid;
	}

	public void setAttendeeid(String Attendeeid) {
		this.Attendeeid = Attendeeid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
