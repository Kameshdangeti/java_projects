//Below we written the code in different pacakge and different class.
//But the difference is we used extends keyword to connect with the first program i.e; Sample.java.
//As we know here also we can't get the output for private and default.
//Because,As we all knew that even though it is extended private can't be accessed because it is access withinthe class.
//And default can only accessed in same package.
//This code is Related to "Sample.java".

package Access_Modifiers;

import Encapsulation.Sample;

public class Sample3 extends Sample
{
	public static void main(String[] args) 
	{	
		    Sample3 s3=new Sample3();
		    System.out.println(s3.i);
			//System.out.println(s3.d);         //Doesn't get the Output.
			System.out.println(s3.ch);
			//System.out.println(s3.b);         //Doesn't get the Output. 
	}
}
