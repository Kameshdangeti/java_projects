package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class OperatorsAndOperatorPrecedence3 
{
   @SuppressWarnings("unused")
public static void main(String[] args) 
   {
	int a=30;
	int b=60;
	int c=30;
	int add=a+b+c;
	int sub=a-c;
	int mul=a*b*c;
	int div=b/c;
	int mod=a%b;
	boolean res1=a>b;
	boolean res2=c<b;
	boolean res3=a>=c;
	boolean res4=b<=a;
	boolean res5=a==b;
	boolean res6=a!=c;
	boolean op1=((a>b)&&(c>b));
	boolean op2=((b>c)||(a<c));
	boolean op3=!(c<a);
	int inc=++a;
	int inc2=b++;
	int dec=--c;
	int dec1=a--;
	int pr1=a+b*c;
	int pr2=(a+b)*c;
	int pr3=a/c*b;
	System.out.println("Addition:"+add);
	System.out.println("Subtraction:"+sub);
	System.out.println("Multiplication:"+mul);
	System.out.println("Division:"+div);
	System.out.println("Modulus:"+mod);
	System.out.println("Greater Than:"+res1);
	System.out.println("Lesser than:"+res2);
	System.out.println("Greater than equal:"+res3);
	System.out.println("Lesser than Equal:"+res4);
	System.out.println("Equals:"+res5);
	System.out.println("Not equals:"+res6);
	System.out.println("And operator:"+op1);
	System.out.println("Or operator:"+op2);
	System.out.println("Not operator:"+op3);
	System.out.println("Operator Precedence:"+pr1);
	System.out.println("Overridden operator precedence:"+pr2);
	System.out.println("Operator Precedence:"+pr3);
   }
}
