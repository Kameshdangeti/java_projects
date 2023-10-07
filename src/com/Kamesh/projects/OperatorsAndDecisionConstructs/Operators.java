//In the below we can see the code for entire types of operators with operators precedence.
//And Not only that we also used paranthesis to override.
package com.Kamesh.projects.OperatorsAndDecisionConstructs;

public class Operators {
	public static void main(String[] args) {

		// Assignment Operators. (It is a simple operators where it is only assigns
		// values from R.H.S to L.H.S)

		int a = 30;
		int b = 60;
		int c = 90;

		// Arithmetic Operators. (It return the values in numbers, so it can be written
		// mostly in int,double,long,short)

		int add = a + b + c;
		int sub = a - b - c;
		int mul = a * b * c;
		double div = a / b;

		// Relation Operators. (It return the values in true/false, so it was written in
		// boolean data type)

		boolean res = a < b;
		boolean res1 = a > c;
		boolean res2 = a <= c;
		boolean res3 = c >= b;
		boolean res4 = a == b;
		boolean res5 = b != c;

		// Logical Operators. (It is also returns values in true/false, so it was
		// written in boolean data type)

		boolean ans = ((a < b) && (a > c)); // And Operator
		boolean ans1 = ((a <= c) || (c >= b)); // Or Operator
		boolean ans2 = !(a > c); // Nor Operator

		// Increment/Decrement Operators. (It return the values in numbers, so it can be
		// written mostly in int,double,long,short)

		int inc = ++a;
		int inc1 = b++;
		int dec = --c;
		int dec1 = b--;

		// Operator Precedence

		int prec = a + b * c;
		int prec1 = (a + b) * c; // Overridden Operator precedence.Because,+,- operators are lower precedence
									// than *,/,%
		int prec2 = a / c * b;

		// output for Arithmetic operators.

		System.out.println("Addition :" + add);
		System.out.println("Subtraction :" + sub);
		System.out.println("Multiplication :" + mul);
		System.out.println("Division :" + div);

		// output for Relational operators.

		System.out.println("Greater Than :" + res);
		System.out.println("less Than :" + res1);
		System.out.println("Greater Than equal :" + res2);
		System.out.println("lesser Than equal :" + res3);
		System.out.println("Equal :" + res4);
		System.out.println("Not equal :" + res5);

		// output for Logical Operators.

		System.out.println("And operator :" + ans);
		System.out.println("Or operator :" + ans1);
		System.out.println("Nor operator :" + ans2);

		// output for Incremental/Decremental operators.

		System.out.println("Incrementing :" + inc);
		System.out.println("Another Incrementing :" + inc1);
		System.out.println("Decrementing :" + dec);
		System.out.println("Another Decrementing :" + dec1);

		// output for operator Precedence.

		System.out.println("operator precedence :" + prec);
		System.out.println("override operator precedence :" + prec1);
		System.out.println("operator precedence :" + prec2);
	}
}
