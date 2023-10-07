package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions5 {
	public static void main(String[] args) {
		try {
			Father5 f5 = (Father5) new Daughter5();
			Father5.kids();
			Daughter5 d5 = (Daughter5) f5;
			Daughter5.kids();
			Son5 s5 = (Son5) f5;
			Son5.kids();
			f5 = d5; // It is written
			f5 = s5; // to fix the warning that is variables f5,d5 is not used any where.
		} catch (ClassCastException e) {
			System.out.println("Downcasting is not possible without upcasting.");
		}
	}
}
