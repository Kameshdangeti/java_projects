package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class OverloadAndArgumentMethodsAndReturnValueMain {
	public static void main(String[] args) {
		OverloadAndArgumentMethodsAndReturnValue o1 = new OverloadAndArgumentMethodsAndReturnValue();
		int result1 = o1.add(10, 20);
		OverloadAndArgumentMethodsAndReturnValue o2 = new OverloadAndArgumentMethodsAndReturnValue();
		int result2 = o2.add(30, 40, 50);
		System.out.println("Addition of 2 integers :" + result1);
		System.out.println("Addition of 3 integers :" + result2);
	}
}
