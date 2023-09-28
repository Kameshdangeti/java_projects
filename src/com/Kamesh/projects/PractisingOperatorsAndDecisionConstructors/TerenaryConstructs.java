package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class TerenaryConstructs
{
	public static void main(String[] args) 
	{
		int x=100;
		int y=200;
		int z=300;
		String Output=((x>y)&&(y>z))?x+"is largest"
			           :(y>x)&&(y>z)?y+" is largest"
				         :z+" is largest";
		System.out.println(Output);
	}

}
