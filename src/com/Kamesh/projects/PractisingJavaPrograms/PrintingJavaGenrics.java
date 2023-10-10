package com.Kamesh.projects.PractisingJavaPrograms;

import java.lang.reflect.Method;

class Printer {
	public static <E> void printArray(E[] list) {
		for (E x : list) {
			System.out.println(x);
		}
	}
}

public class PrintingJavaGenrics {
	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		Printer.printArray(intArray);
		Printer.printArray(stringArray);
		int count = 0;

		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");
	}

}
