package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions2 {
	public static void main(String[] args) {
		try {
			Father2 f2 = (Father2) new Daughter2();
			Father2.family();
			Daughter2 d2 = (Daughter2) f2;
			Daughter2.family();
			Son2 s2 = (Son2) f2;
			Son2.family();
			f2 = d2; // It is written
			f2 = s2; // to fix the warning that is variables f2,d2 is not used any where.
		} catch (ClassCastException e) {
			System.out.println("Down catsing is not possible without Upcasting.");
		}
	}

}
