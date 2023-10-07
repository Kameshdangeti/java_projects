//to get the output we should call main in another class.
//And the below code is main method for "Animal.java".
package com.Kamesh.projects.Inheritance;

public class RuntimePolymorphismMain {
	public static void Forest(RuntimePolymorphism a) {
		a.noise();
	}

	public static void main(String[] args) {
		Forest((RuntimePolymorphism) new lion());
		Forest((RuntimePolymorphism) new Tiger());
		Forest((RuntimePolymorphism) new Panther());

	}
}
