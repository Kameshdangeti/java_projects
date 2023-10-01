package com.Kamesh.projects.PractisingJavaApi;

import java.util.function.Predicate;

public class LambdaPredicateExpression3 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p3= i -> i>=30;
		System.out.println("Predicate Value - 1 :"+p3.test(40));
		System.out.println("Predicate Value - 2 :"+p3.test(30));
		System.out.println("Predicate Value - 3 :"+p3.test(20));
	}
}
