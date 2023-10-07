//Below code is for the predicate of Lambda Expression.

package com.Kamesh.projects.JavaAPI;

import java.util.function.Predicate;

public class LambdaPredicateExpression {
	public static void main(String[] args) {
		Predicate<Integer> pde = i -> i >= 10; // Lambda Expression
		System.out.println("Predicate value-1 :" + pde.test(10));
		System.out.println("Predicate value-2 :" + pde.test(0));
		System.out.println("Predicate value-3 :" + pde.test(5));
		System.out.println("Predicate value-4 :" + pde.test(20));
	}
}
