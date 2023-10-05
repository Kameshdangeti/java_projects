package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class DefaultAndUserDefinedConstructors3 
{
	private int empid;
	private String ename;
	private double esal;
	private String epos;
	public DefaultAndUserDefinedConstructors3() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public DefaultAndUserDefinedConstructors3(int empid, String ename, double esal, String epos) 
	{
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.epos = epos;
	}
	public static void main(String[] args) 
    {
    	DefaultAndUserDefinedConstructors3 d4 =new DefaultAndUserDefinedConstructors3();
    	System.out.println("Default constructor");
    	d4.getClass();
    	DefaultAndUserDefinedConstructors3 d5 =new DefaultAndUserDefinedConstructors3(1357,"Kamesh",40000.43,"Developer");
        System.out.println("Employee id :"+d5.empid);
        System.out.println("Employee Name :"+d5.ename);
        System.out.println("Employee Salary :"+d5.esal);
        System.out.println("Employee Position :"+d5.epos);
	}
}
