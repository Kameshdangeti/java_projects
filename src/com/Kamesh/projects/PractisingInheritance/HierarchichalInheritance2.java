package com.Kamesh.projects.PractisingInheritance;

import com.Kamesh.projects.Inheritance.HierarchicalInheritance;

public class HierarchichalInheritance2
{
	public void demo1()
	{
		System.out.println("Demo1");
	}
}
class G1 extends HierarchicalInheritance
{
	public void demo2()
	{
		demo1();
		System.out.println("Demo2");
	}
}
class H1 extends HierarchicalInheritance
{
	public void demo3()
	{
		demo1();
		System.out.println("Demo3");
	}
}
