            //NullPointerExceptions
/*package Exceptions;                      //code for normal condition.

public class Null_Pointer_Exceptions 
{
	public static  String s="Java";
    
	public static void main(String[] args)
	{
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println("Hii");
	}
}*/


/*package Exceptions;

public class Null_Pointer_Exceptions       //code for abnormal Condition.
{
	public static  String s;         //Dangerous Statement.
    
	public static void main(String[] args)
	{
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println("Hii");
	}
}*/

//And the exception can be handled by using try/catch block as we can see in below code.

package Handling_Exceptions;

public class Null_Pointer_Exceptions 
{
	public static  String s;
    
	public static void main(String[] args)
	{
		try
		{
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		}
		catch (NullPointerException e)
		{
			System.out.println("String values were not declared in the statement.");
			System.out.println("Hii");
		}
	}
}
