//Below we can see he main method for Animal.java.
//to get the output we should write main in another class.
package Polymorphism;

public class Animal_Main 
{
	public static void Forest(Animal a)
	{
		a.noise();
	}
  public static void main(String[] args) 
  {
	Forest((Animal) new lion());
	Forest((Animal) new Tiger());
	Forest((Animal) new Panther());
	
  }
}
