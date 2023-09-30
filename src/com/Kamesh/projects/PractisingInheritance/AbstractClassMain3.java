package com.Kamesh.projects.PractisingInheritance;

public class AbstractClassMain3 
{
  public static void main(String[] args)
  {
	 Tester t= new Tester();
	 t.work();
	 AbstractClass3 a3 =(AbstractClass3) new Tester();
	 a3.work();
  }
}
