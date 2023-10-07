package com.Kamesh.projects.PractisingInheritance;

class SingleLevelInheritance2 {
	public void Tennis() {
		System.out.println("Tennis is a game");
	}
}

class Game extends SingleLevelInheritance2 {
	public void Badminton() {
		System.out.println("Badminton is also a game");
	}
}