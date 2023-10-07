package com.Kamesh.projects.PractisingJavaApi;

import java.util.function.Predicate;

public class LambdaPredicateExpression4 {
	public static void main(String[] args) {
		Predicate<Integer> p4 = i -> i <= 40;
		System.out.println("Predicate Value - 1 :" + p4.test(20));
		System.out.println("Predicate Value - 2 :" + p4.test(30));
		System.out.println("Predicate Value - 3 :" + p4.test(40));
	}
}
