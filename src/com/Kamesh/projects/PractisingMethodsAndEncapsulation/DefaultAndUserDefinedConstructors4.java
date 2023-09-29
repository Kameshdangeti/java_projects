package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class DefaultAndUserDefinedConstructors4 
{
	private String mname;
	private double mprice;
	private String color;
	private int msize;
	public DefaultAndUserDefinedConstructors4() 
	{
		super();
	}
	public DefaultAndUserDefinedConstructors4(String mname, double mprice, String color, int msize) {
		super();
		this.mname = mname;
		this.mprice = mprice;
		this.color = color;
		this.msize = msize;
	}
	public static void main(String[] args) 
	{
		DefaultAndUserDefinedConstructors4 d6 =new DefaultAndUserDefinedConstructors4();
		System.out.println("Default Constructor");
		DefaultAndUserDefinedConstructors4 d7 =new DefaultAndUserDefinedConstructors4("RealMe",12500.89,"Cyan",5);
		System.out.println("Mobile Name :"+d7.mname);
		System.out.println("Mobile price :"+d7.mprice);
		System.out.println("Mobile color :"+d7.color);
		System.out.println("Mobile size :"+d7.msize);
	}
}
