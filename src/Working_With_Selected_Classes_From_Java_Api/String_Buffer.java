//Below we can see the code for String Buffer.

package Working_With_Selected_Classes_From_Java_Api;

public class String_Buffer 
{
	public static void main(String[] args)
	{
		StringBuffer s1= new StringBuffer("Java");
		StringBuffer s2= new StringBuffer("Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 :"+s1.hashCode());
		System.out.println("s2 :"+s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.append("Programmer"));
		System.out.println("Changed s1:"+s1.hashCode());
	}
}
