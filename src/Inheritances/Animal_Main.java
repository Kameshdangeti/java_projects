//to get the output we should call main in another class.
//And the below code is main method for "Animal.java".
package Inheritances;

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
