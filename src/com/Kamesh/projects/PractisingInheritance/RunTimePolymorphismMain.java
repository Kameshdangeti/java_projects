package com.Kamesh.projects.PractisingInheritance;

public class RunTimePolymorphismMain {
	public static void Animals(RunTimePolymorphism r) {
		r.noise();
	}

	public static void main(String[] args) {
		Animals((RunTimePolymorphism) new Lion());
		Animals((RunTimePolymorphism) new Cow());
	}
}
