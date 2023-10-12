package com.Kamesh.projects.PractisingJavaPrograms;

import java.lang.annotation.*;

public class FamilyMember {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@interface FamilyBudget {
		String userRole() default "GUEST";

		int budgetLimit() default 100;
	}

	class FamilyMember1 {
		@FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
		public void seniorMember(int budget, int moneySpend) {
			System.out.println("Senior Member");
			System.out.println("Spend: " + moneySpend);
			System.out.println("Budget Left: " + (budget - moneySpend));
		}

		@FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
		public void juniorUser(int budget, int moneySpend) {
			System.out.println("Junior Member");
			System.out.println("Spend: " + moneySpend);
			System.out.println("Budget Left: " + (budget - moneySpend));
		}
	}

}
