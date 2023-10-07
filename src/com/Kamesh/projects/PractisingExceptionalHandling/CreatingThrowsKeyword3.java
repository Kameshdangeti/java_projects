package com.Kamesh.projects.PractisingExceptionalHandling;

public class CreatingThrowsKeyword3 {
	public static void College() throws InterruptedException {
		System.out.println("EEE Department.");
		Thread.sleep(3000);
		System.out.println("ECE Department");
	}

	public static void main(String[] args) {
		try {
			College();
		} catch (InterruptedException e) {
			System.out.println("Exception Handled");
		}
	}
}
