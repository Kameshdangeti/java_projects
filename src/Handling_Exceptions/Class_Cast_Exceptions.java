/*package Exceptions;

public class Class_Cast_Exceptions               //It is written in seperate class.
{
	public static void main(String[] args) 
	{
		Father f=(Father) new Daughter();       //Up casting
		f.kids();            
		Daughter d=(Daughter)f;                 //Down casting
		d.kids(); 
		Son s=(Son) f;                          //Down casting      //This statement of is not possible
		s.kids();                                                   //it creates Exception.Because,there is no upcasting.
	}
}*/


//And the exception can be handled by using try/catch block as we can see in below code.

package Handling_Exceptions;

public class Class_Cast_Exceptions
{
	public static void main(String[] args) 
	{
		try
		{
		Father f=(Father) new Daughter();       //Up casting
		f.kids();            
		Daughter d=(Daughter)f;                 //Down casting
		d.kids();
		Son s=(Son) f;                          //Down casting
		s.kids();
		}
		catch (ClassCastException e)
		{
			System.out.println("Down casting is not possible without upcasting");
		}
	}
}
