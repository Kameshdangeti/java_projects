//Below we can see the code for Interface class.

package Inheritances;

 interface Sample 
 {
	 void move();
 }
  interface Sample1 extends Sample
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
 