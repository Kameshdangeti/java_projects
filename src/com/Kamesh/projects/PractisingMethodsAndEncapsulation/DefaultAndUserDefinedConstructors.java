package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class DefaultAndUserDefinedConstructors {
	private String name;
	private int age;
	private String gender;
	private double height;

	public DefaultAndUserDefinedConstructors() {
		super();
	}

	public DefaultAndUserDefinedConstructors(String name, int age, String gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
		DefaultAndUserDefinedConstructors d = new DefaultAndUserDefinedConstructors();
		System.out.println("Default constructors");
		d.getClass();

		DefaultAndUserDefinedConstructors d1 = new DefaultAndUserDefinedConstructors("Kamesh", 23, "Male", 5.11);
		System.out.println("Name :" + d1.name);
		System.out.println("Age :" + d1.age);
		System.out.println("Gender :" + d1.gender);
		System.out.println("Height :" + d1.height);
	}
}
