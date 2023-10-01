package com.Kamesh.projects.PractisingJavaApi;

import java.util.function.Predicate;

public class LambdaPredicateExpression
{
    public static void main(String[] args) 
    {
		Predicate<Integer> p1=i   -> i>=10;
		System.out.println("Predicate value-1 :"+p1.test(10));
		System.out.println("Predicate value-2 :"+p1.test(5));
		System.out.println("Predicate value-3 :"+p1.test(15));
	}
}
