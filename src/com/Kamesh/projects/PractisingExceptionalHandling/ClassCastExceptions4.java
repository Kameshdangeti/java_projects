package com.Kamesh.projects.PractisingExceptionalHandling;

public class ClassCastExceptions4 {
	public static void main(String[] args) {
		try {
			Father4 f4 = (Father4) new Daughter4();
			Father4.kids();
			Daughter4 d4 = (Daughter4) f4;
			Daughter4.kids();
			Son4 s4 = (Son4) f4;
			Son4.kids();
			f4 = d4; // It is written
			f4 = s4; // to fix the warning that is variables f2,d2 is not used any where.
		} catch (ClassCastException e) {
			System.out.println("DownCasting is not possible without Upcasting.");
		}
	}
}
