package com.Kamesh.projects.PractisingJavaApi;

public class StringBufferClass3 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Core");
		StringBuffer s2 = new StringBuffer("Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 :" + s1.hashCode());
		System.out.println("s2 :" + s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.append("Developer"));
		System.out.println("Changed s1:" + s1.hashCode());
	}
}
