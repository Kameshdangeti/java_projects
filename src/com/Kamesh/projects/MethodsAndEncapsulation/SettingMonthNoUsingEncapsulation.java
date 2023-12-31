//Below we can see the code for the Applying the Encapsulation.
//Write a program to set Month Number by using Encapsulation.
//and here we combined/binded the variables and methods into a single Unit.
//Main method of this class is called on seperate class i.e.,"SettingMonthNoUsingEncapsulationMain.java"
package com.Kamesh.projects.MethodsAndEncapsulation;

public class SettingMonthNoUsingEncapsulation {
	private int monthno;

	public void givemonthno(int monthno) {
		if (monthno >= 1 && monthno <= 12) {
			this.setMonthno(monthno);
			System.out.println("Month Number is set succesfully.");
		} else {
			System.err.println("Given Month number is Invalid.");
			System.err.println("Month Number must be between 1-12");
		}
	}

	public int getMonthno() {
		return monthno;
	}

	public void setMonthno(int monthno) {
		this.monthno = monthno;
	}
}
