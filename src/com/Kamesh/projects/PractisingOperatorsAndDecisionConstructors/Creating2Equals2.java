package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class Creating2Equals2 
{
  public static void main(String[] args)
  {
	String s1="Kamesh";
	String s2="Lucky";
	String s3="Kamesh";
	
	System.out.println("Statement is:"+(s1==s3));
	System.out.println("Statement is:"+(s1==s2));
	System.out.println("Statement is:"+s1.equals(s3));
	System.out.println("Statement is:"+s1.equals(s2));
  }
}
