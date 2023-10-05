//Below code is main method of "HierarchicalInheritance.java".
//To get the output we should write in seperate class
package com.Kamesh.projects.Inheritance;

public class HierarchicalInheritanceMain 
{
	public static void main(String[] args) 
	{
		G g=new G();
		H h=new H();
		g.demo2();
		g.demo1();
		h.getClass();  //It is written to fix the warning i.e., Varible 'h' is not used
	}
}
