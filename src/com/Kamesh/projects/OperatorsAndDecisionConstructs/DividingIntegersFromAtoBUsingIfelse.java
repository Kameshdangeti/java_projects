//write a program to print number which are divisible by 4  between a and b using if and if-else
package com.Kamesh.projects.OperatorsAndDecisionConstructs;

public class DividingIntegersFromAtoBUsingIfelse {
	public static void main(String[] args) {

		// code for if,if-else

		int a = 10;
		int b = 13;
		for (int i = a; i <= b; i++) {
			if (i % 4 == 0) {
				System.out.println("The numbers which are divisible by 4 and 6 :" + i);
			} else {
				System.out.println("There are no numbers which are divisible by 4 and 6 ");
			}
		}

	}
}
