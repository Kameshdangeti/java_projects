package com.Kamesh.projects.PractisingJavaBasics;

public class CreatingStaticAndNonStatic3 {
	public void FavDestination() {
		System.out.println("Kerala");
	}

	public void FavdestForeign() {
		System.out.println("U.S.A");
	}

	public static void Favspirtual() {
		System.out.println("Tirupathi,Varanasi");
	}

	public static void main(String[] args) {
		CreatingStaticAndNonStatic3 c3 = new CreatingStaticAndNonStatic3();
		c3.FavDestination();
		c3.FavdestForeign();
		Favspirtual();
	}
}
