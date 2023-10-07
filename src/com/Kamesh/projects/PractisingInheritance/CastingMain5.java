package com.Kamesh.projects.PractisingInheritance;

public class CastingMain5 {

	public static void main(String[] args) {
		Casting c9 = new Bus4();
		c9.move();
		Bus4 b = (Bus4) c9;
		b.carry();
		b.move();
		Casting c10 = (Casting) new Lorry4();
		c10.move();
		Lorry4 l = (Lorry4) c10;
		l.move();
		l.trasport();
	}
}
