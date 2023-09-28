package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class OperatorsAndOperatorPrecedence4
{
	public static void main(String[] args) 
	{
		int x=90;
		int y=60;
		int z=30;
		int add=y+z+x;
		int sub=z-x;
		int mul=x*z*y;
		int div=z/x;
		int mod=x%y;
		boolean res1=x>y;
		boolean res2=y<z;
		boolean res3=z>=x;
		boolean res4=y<=x;
		boolean res5=z==y;
		boolean res6=x!=y;
		boolean op1=((x>y)&&(z<y));
		boolean op2=((z<y)||(y>x));
		boolean op3=!(x>y);
		int p1=x+y*z;
		int p2=(x+y)*z;
		int p3=z/x+y;
		System.out.println("Addition:"+add);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+mul);
		System.out.println("Division:"+div);
		System.out.println("Modulus:"+mod);
		System.out.println("Greater than:"+res1);
		System.out.println("lesser than:"+res2);
		System.out.println("Greater than equal:"+res3);
		System.out.println("Lesser than equal:"+res4);
		System.out.println("Equals:"+res5);
		System.out.println("Not Equals:"+res5);
		System.out.println("Operator prcedence:"+p1);
		System.out.println("Overriden operator precednece:"+p2);
		System.out.println("Operator precedence:"+p3);
	}
}
