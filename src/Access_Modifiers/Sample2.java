//Below we written the code in different and different package.
//so,we can get output for only  the public int.Because,As we know private canspecify within the class.
//And protected cannot be accessed because,code is written in the different package.And we all knew default,
//is only accessed within the package.
package Access_Modifiers;

import Encapsulation.Sample;

public class Sample2
{
	public static void main(String[] args) 
	{
		Sample s1= new Sample();
		System.out.println(s1.i);
	//	System.out.println(s1.d);          //Doesn't get Output.
	//	System.out.println(s1.ch);         //Doesn't get Output.
	//	System.out.println(s1.b);          //Doesn't get Output.
	}
}
