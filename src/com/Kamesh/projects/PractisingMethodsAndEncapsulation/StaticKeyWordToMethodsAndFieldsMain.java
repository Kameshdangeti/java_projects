package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class StaticKeyWordToMethodsAndFieldsMain {
	public static void main(String[] args) {
		StaticKeyWordToMethodsAndFields s1 = new StaticKeyWordToMethodsAndFields("Kamesh");
		StaticKeyWordToMethodsAndFields s2 = new StaticKeyWordToMethodsAndFields("Lucky");
		StaticKeyWordToMethodsAndFields.setclg("BVCE");
		s1.getPersoninfo();
		s2.getPersoninfo();
	}
}
