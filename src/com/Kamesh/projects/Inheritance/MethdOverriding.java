//Below we can see the code for the Method overriding.
//As we  can see the code for the below class is called in
//seperate class i.e.,in "MethodOverridingMain.java".
package com.Kamesh.projects.Inheritance;

class MethdOverriding {
	public void run() {
		System.out.println("Running is an Excercise");
	}

	public void gym() {
		System.out.println("gym is also an Excercise");
	}
}

class Health extends MethdOverriding {
	public void yoga() {
		System.out.println("Yoga is also an Exercise");
	}
}

class Diet extends Health // Method Overrided.
{
	public void yoga() {
		System.out.println("yoga is best");
	}

	public void gym() {
		System.out.println("gym is also best");
	}
}
