package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class DefaultAndUserDefinedConstructors5 
{
	private String cname;
	private int ccode;
	private String cplace;
	private String csize;
	public DefaultAndUserDefinedConstructors5() 
	{
		super();
	}
	public DefaultAndUserDefinedConstructors5(String cname, int ccode, String cplace, String csize)
	{
		super();
		this.cname = cname;
		this.ccode = ccode;
		this.cplace = cplace;
		this.csize = csize;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		DefaultAndUserDefinedConstructors5 d8 =new DefaultAndUserDefinedConstructors5();
		System.out.println("Default constructor");
		DefaultAndUserDefinedConstructors5 d9 =new DefaultAndUserDefinedConstructors5("BVCEC",225,"Odalarevu","40Acres");
		System.out.println("College name :"+d9.cname);
		System.out.println("College code :"+d9.ccode);
		System.out.println("College Place :"+d9.cplace);
		System.out.println("College size :"+d9.csize);
	}
}
