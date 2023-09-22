//In the below we can see the code for both declaring and initializing of the primitive data types and 
//object reference variable.
//As we can see the primitive data types which are written inside main method can be printed directly.
//but when comes to other primitive data type which are written above/outside the main method.
//we created an reference variable because it is in non-static and then we printed them.
package working_With_java_datatypes;

public class Differentiate_btw_ObjectReferenceVariable_and_PrimittiveDataTypes 
{
	
				float e=50.5f;
				double f=60.678;
				char  g='K';
				boolean h=true;
		
	public static void main(String[] args) 
	{
		
		//Primitive data types which stored value, and it can print directly because they are in static.
		
				byte a=10;
				short b=20;
				int c=30;
				long d=4000000l;
			
			System.out.println("Byte value is :"+a);
			System.out.println("Short value is :"+b);
			System.out.println("int value is :"+c);
			System.out.println("long value is :"+d);
			
	    //Primitive data types which stored value, and it can print by creating object reference variable.
	    //Because the data types are in non-static.
			
				Differentiate_btw_ObjectReferenceVariable_and_PrimittiveDataTypes d1 = 
					new	Differentiate_btw_ObjectReferenceVariable_and_PrimittiveDataTypes();
			
			System.out.println("Float value is :"+d1.e);
			System.out.println("Double value is :"+d1.f);
			System.out.println("Char value is :"+d1.g);
			System.out.println("Boolean value is :"+d1.h);
	}
}
