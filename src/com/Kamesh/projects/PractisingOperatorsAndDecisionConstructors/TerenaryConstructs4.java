package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class TerenaryConstructs4 
{
  public static void main(String[] args)
  {
	  int d=10;
	  int e=100;
	  int f=20;
	  String result=((d>e)&&(d>f))?d+"is largest"
			        :(e>f)&&(e>d)?e+" is largest"
			        		:f+"is largest";
	  System.out.println(result);
}
}
