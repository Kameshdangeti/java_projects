//Below we can see the code for the entire types of Inheritances i.e.,single-level,multi-level,Hierarchical,Multiple.
//And we know that in inheritance superclass and subclass are available.and in Inheritance Subclass can access
//properties of superclass directly.
//And the main method is called in another class i.e.,"A_main.java".

                             //Single-Level Inheritances.  
               //Here single level is only possible i.e.,1 subclass extends Superclass.
package Inheritances;

 class A 
{
	public void test()
	{
		System.out.println("Code Testing is done.");
	}
}
class B extends A
{
	public void develop()
	{
		System.out.println("Code developing is done.");
	}
}
