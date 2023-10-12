package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

import com.Kamesh.projects.PractisingJavaPrograms.FamilyMember.FamilyBudget;

import java.lang.reflect.*;

public class JavaAnnotations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String role = in.next();
			int spend = in.nextInt();
			try {
				Class<FamilyMember> annotatedClass = FamilyMember.class;
				Method[] methods = annotatedClass.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit = family.budgetLimit();
						if (userRole.equals(role)) {
							if (spend <= budgetLimit) {
								method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);
							} else {
								System.out.println("Budget Limit Over");
							}
							in.close();
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			testCases--;
		}
	}

}
