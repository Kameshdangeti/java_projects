package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class DefaultAndUserDefinedConstructors2
{
    private String laptopname;
    private String laptopcolor;
    private int laptopgen;
    private int laptopsize;
	public DefaultAndUserDefinedConstructors2()
	{
		super();
	}
	public DefaultAndUserDefinedConstructors2(String laptopname, String laptopcolor, int laptopgen, int laptopsize)
	{
		super();
		this.laptopname = laptopname;
		this.laptopcolor = laptopcolor;
		this.laptopgen = laptopgen;
		this.laptopsize = laptopsize;
	}
    @SuppressWarnings("unused")
	public static void main(String[] args)
    {
    	DefaultAndUserDefinedConstructors2 d2=new DefaultAndUserDefinedConstructors2();
    	System.out.println("Default constructor");
    	DefaultAndUserDefinedConstructors2 d3=new DefaultAndUserDefinedConstructors2("DELL","Silver",10,14);
    	System.out.println("Laptop name :"+d3.laptopname);
    	System.out.println("Laptop color :"+d3.laptopcolor);
    	System.out.println("Laptop generation :"+d3.laptopgen);
    	System.out.println("Laptop size :"+d3.laptopsize);
	}
}
