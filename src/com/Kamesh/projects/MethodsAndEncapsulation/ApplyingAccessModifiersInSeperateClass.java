//Below we written the code in same package,But called in different class.
//Here the  private double can't get Output.Because,private can access only within the class. 
//This code is Related to "ApplyingAccessModifiers.java".
package com.Kamesh.projects.MethodsAndEncapsulation;

public class ApplyingAccessModifiersInSeperateClass {
	public static void main(String[] args) {
		ApplyingAccessModifiers s1 = new ApplyingAccessModifiers();
		System.out.println(s1.i);
		// System.out.println(s1.d); //Doesn't Get Output
		System.out.println(s1.ch);
		System.out.println(s1.b);

	}

}
