package com.Kamesh.projects.PractisingExceptionalHandling;

public class InterruptedExceptions5 {
	public static void main(String[] args) {
		System.out.println("Where are");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You");
	}
}
