          //code for Raw Type ArrayList.

package Working_With_Selected_Classes_From_Java_Api;

import java.util.ArrayList;

public class Raw_Type_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Object> a=new ArrayList();
		a.add('A');
		a.add(13.9);
		a.add(777);
		a.add(true);
		a.add(null);
		System.out.println(a);
	}

}
