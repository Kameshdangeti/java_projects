//Below we written the code in same package,But in different class.
//Here the  private double can't get Output.Because,private can access only within the class. 
package Encapsulation;

public class Sample1
{
	public static void main(String[] args) 
	{
		Sample s1= new Sample();
		System.out.println(s1.i);
	//	System.out.println(s1.d);           //Doesn't Get Output
		System.out.println(s1.ch);
		System.out.println(s1.b);
		
	}

}
