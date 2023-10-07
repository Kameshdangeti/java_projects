package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class StaticKeyWordToMethodsAndFields4 {
	public String Name;
	public int rollno;
	static String clgname;
	static int counter = 0;

	public StaticKeyWordToMethodsAndFields4(String name) {
		super();
		this.Name = name;
		this.rollno = setRollno();
	}

	static int setRollno() {
		counter++;
		return counter;
	}

	static void setclg(String name) {
		clgname = name;
	}

	public void getPersoninfo() {
		System.out.println("Person Name :" + this.Name);
		System.out.println("Person Rollno:" + this.rollno);
		System.out.println("Person college name:" + clgname);
	}

}
