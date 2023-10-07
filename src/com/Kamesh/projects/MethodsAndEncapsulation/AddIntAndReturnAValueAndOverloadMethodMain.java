//Below we can see the code for Main method of "AddIntAndReturnAValueAndOverloadMethod.java".
//By this Main Method we can call and pass The Method.
//And not only that Method overriding and return values can also be seen.
package com.Kamesh.projects.MethodsAndEncapsulation;

public class AddIntAndReturnAValueAndOverloadMethodMain {
	public static void main(String[] args) {
		AddIntAndReturnAValueAndOverloadMethod a = new AddIntAndReturnAValueAndOverloadMethod();
		int res1 = a.sum(30, 60);
		AddIntAndReturnAValueAndOverloadMethod a1 = new AddIntAndReturnAValueAndOverloadMethod();
		int res2 = a1.sum(20, 50, 40); // Method Calling And Passing.
		System.out.println("Adding 2 integers values :" + res1);
		System.out.println("Adding 3 integers values :" + res2);
	}
}
