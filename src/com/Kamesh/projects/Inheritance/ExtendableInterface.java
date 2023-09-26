//Below we can see the code for Interface class.
//And the main method is called seperately in the class named ;"Sample_main.java".
package com.Kamesh.projects.Inheritance;

 interface ExtendableInterface 
 {
	 void move();
 }
  interface Sample1 extends ExtendableInterface
  {
	  void move1();
  }
  class Demo implements Sample1
  {
	  public void move()
	  {
		  System.out.println("Move implements");
	  }
	  public void move1()
	  {
		  System.out.println("Move 1 implements.");
	  }
  }
 