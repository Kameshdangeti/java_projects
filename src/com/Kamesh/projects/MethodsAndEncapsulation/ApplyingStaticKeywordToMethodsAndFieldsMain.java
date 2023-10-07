//The below code is the main method for the "ApplyingStaticKeywordToMethodsAndFields.java".
//And it should be written in another class
package com.Kamesh.projects.MethodsAndEncapsulation;

public class ApplyingStaticKeywordToMethodsAndFieldsMain {

	public static void main(String[] args) {
		ApplyingStaticKeywordToMethodsAndFields p1 = new ApplyingStaticKeywordToMethodsAndFields("Lucky");
		ApplyingStaticKeywordToMethodsAndFields p2 = new ApplyingStaticKeywordToMethodsAndFields("Kamesh");
		ApplyingStaticKeywordToMethodsAndFields.setclg("SPCE");
		p1.getPersoninfo();
		p2.getPersoninfo();
	}
}
