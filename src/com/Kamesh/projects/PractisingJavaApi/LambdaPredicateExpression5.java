package com.Kamesh.projects.PractisingJavaApi;

import java.util.function.Predicate;

public class LambdaPredicateExpression5 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p5= i -> i>=50;
		System.out.println("Predicate value - 1 :"+p5.test(50));
		System.out.println("Predicate value - 2 :"+p5.test(40));
		System.out.println("Predicate value - 3 :"+p5.test(60));
	}
}
