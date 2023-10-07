package com.Kamesh.projects.PractisingInheritance;

public class CastingMain4 {
	public static void main(String[] args) {
		Casting c7 = new Bus3();
		c7.move();
		Bus3 b = (Bus3) c7;
		b.carry();
		b.move();
		Casting c8 = (Casting) new Lorry3();
		c8.move();
		Lorry3 l = (Lorry3) c8;
		l.move();
		l.trasport();
	}
}
