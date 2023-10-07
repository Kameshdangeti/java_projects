package com.Kamesh.projects.PractisingExceptionalHandling;

public class CreatingThrowsKeyword5 {
	public static void School() throws InterruptedException {
		System.out.println("Teacher");
		Thread.sleep(5000);
		System.out.println("Student");
	}

	public static void main(String[] args) {
		try {
			School();
		} catch (InterruptedException e) {
			System.out.println("Exception Handled");
		}
	}
}
