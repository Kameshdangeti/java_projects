//Below we can see the code for the call-by-Values.
package Encapsulation;

public class Call_by_value 
{
	int change (int b)

	{
		++b;
		return b;
	}
	public static void main(String[] args)
	{
		Call_by_value clv=new Call_by_value();
		int a=20;
		int c=clv.change(a);
		
		System.out.println("Value of 'a' after passing :"+a);
		System.out.println("Value of 'c' after passing :"+c);
		
	}
}
