//Below we can see the code for String Builder.

package Working_With_Selected_Classes_From_Java_Api;

public class String_Builder
{
	public static void main(String[] args)
	{
		String [] StringArray= {"java_programming","MYSQL","Web_Technology","Java_Library"};
		String s =" ";
		System.err.println("Before String Object :"+s.hashCode());
		for (String string : StringArray) 
		{
			string =string+" ";
			System.out.println("String Object :"+string.hashCode());
		}
	}
}
