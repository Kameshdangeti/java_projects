package com.Kamesh.projects.PractisingJavaBasics;

public class CreatingStaticandNonStatic2 {
	public void EmpCompanyname() {
		System.out.println("Google");
	}

	public static void Empsalary() {
		System.out.println("50,000");
	}

	public static void main(String[] args) {
		CreatingStaticandNonStatic2 c = new CreatingStaticandNonStatic2();
		c.EmpCompanyname();
		Empsalary();
	}
}
