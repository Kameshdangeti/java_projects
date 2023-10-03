//Here we can see the code developed for wrapper class for all the Primitive data types
package com.Kamesh.projects.JavaDataTypes;

public class WrapperClasses 
{

    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
    	
    //Primitive data types. 
    	
    	byte a=10;
    	short b=20;
    	int c=30;
    	long d=4000000l;
    	float e=50.5f;
    	double f=60.678;
    	char  g='K';
    	boolean h=true;
    	
    //Wrapping the data types by creating Wrapper objects.
    	
    	Byte a1=new Byte(a);
    	System.out.println("Wrapped byte value:"+a);
    	
    	Short b1= new Short(b);
    	System.out.println("Wrapped short value:"+b);
    	
    	Integer c1 =new Integer(c);
    	System.out.println("Wrapped int value:"+c);
    	
    	Long d1 =new Long(d);
    	System.out.println("Wrapped long value:"+d);
    	
    	Float e1 =new Float(e);
    	System.out.println("Wrapped float value:"+e);
    	
    	Double f1 =new Double(f);
    	System.out.println("Wrapped double value:"+f);
    	
    	Character g1 =new Character(g);
    	System.out.println("Wrapped char value:"+g);
    	
    	Boolean h1 =new Boolean(h);
    	System.out.println("Wrapped boolean value:"+h);
	}
}
