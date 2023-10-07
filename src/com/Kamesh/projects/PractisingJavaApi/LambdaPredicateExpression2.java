package com.Kamesh.projects.PractisingJavaApi;

import java.util.function.Predicate;

public class LambdaPredicateExpression2 {
	public static void main(String[] args) {
		Predicate<Integer> p2 = i -> i <= 20;
		System.out.println("Predicate value -1 :" + p2.test(30));
		System.out.println("Predicate value -2 :" + p2.test(40));
		System.out.println("Predicate value -3 :" + p2.test(50));
	}
}
