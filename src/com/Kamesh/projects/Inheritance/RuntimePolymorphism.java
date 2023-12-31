//Polymorphism is nothing but having multiple/more than 1 form.
//Below we can see the codes for polymorphism and we knew that it is of 2 types
//Runtime,compiletime.
//And this code main is called seperately in the other class i.e.,"RuntimePolymorphismMain.java".

//Run-Time Polymorphism.
package com.Kamesh.projects.Inheritance;

interface RuntimePolymorphism {
	void noise();
}

class lion implements RuntimePolymorphism {
	public void noise() {
		System.out.println("lion roars.");
	}
}

class Tiger implements RuntimePolymorphism {
	public void noise() {
		System.out.println("Tiger roars");
	}
}

class Panther implements RuntimePolymorphism {
	public void noise() {
		System.out.println("panther roars");
	}
}