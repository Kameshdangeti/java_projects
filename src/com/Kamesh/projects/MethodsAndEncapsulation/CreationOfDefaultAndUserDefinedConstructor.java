//Below we can see the code for Constructor over-load.
//And differentiation between the Default and User-defied constructor.
package com.Kamesh.projects.MethodsAndEncapsulation;

public class CreationOfDefaultAndUserDefinedConstructor 
{
	private int empid;
	private String empname;
	private String companyname;
	private String dept;
	private double sal;
	
	public CreationOfDefaultAndUserDefinedConstructor()                                 //Default Constructor.
	{
      System.out.println("Default constructor");             
	}
	
	
	
	
	public CreationOfDefaultAndUserDefinedConstructor(int i, String empname, String companyname, String dept, double sal) 
	{
		super();
		this.empid = i;
		this.empname = empname;                               //User-Defined Constructor.
		this.companyname = companyname;
		this.dept = dept;
		this.sal = sal;
	}
	
	
	public static void main(String[] args) 
	{
		CreationOfDefaultAndUserDefinedConstructor e1 = new CreationOfDefaultAndUserDefinedConstructor();           
		System.out.println("Default constructor");
		
		CreationOfDefaultAndUserDefinedConstructor e2=new CreationOfDefaultAndUserDefinedConstructor(1234,"Kamesh","Wipro","Developer",35000.9);
		System.out.println("Employee id :"+e2.empid);
		System.out.println("Employee name :"+e2.empname);
		System.out.println("Employee company name :"+e2.companyname);
		System.out.println("Employee Department name :"+e2.dept);
		System.out.println("Employee salary :"+e2.sal);
		
	}

}
