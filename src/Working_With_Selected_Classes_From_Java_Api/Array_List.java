//Below we can see the code for the ArrayList.
//and We Knew that ArrayList is of 2 types Genric type and Raw type.
//And we also multiple methods used in Lists.

       //code for Genric Type.
package Working_With_Selected_Classes_From_Java_Api;

import java.util.ArrayList;

public class Array_List
{
	public static void main(String[] args) 
	{
		ArrayList<Character> a=new ArrayList();
		a.add('K');
		a.add('A');
		a.add('M');
		a.add('E');
		a.add('S');
		a.add('H');
		a.add(null);
		System.out.println(a);
	}
}
