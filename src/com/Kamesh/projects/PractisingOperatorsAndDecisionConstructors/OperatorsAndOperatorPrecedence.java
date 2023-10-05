package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class OperatorsAndOperatorPrecedence 
{
public static void main(String[] args) 
  {
	int a=10;
	int b=20;
	int c=30;
	
	int add=a+b+c;
	int sub=c-b-a;
	int mul=a*b*c;
	int div=b/a;
	
	boolean res1=a==b;
	boolean res2=a>b;
	boolean res3=b<c;
	boolean res4=c>=a;
	boolean res5=a<=b;
	boolean res6=a!=b;
	
	boolean output1=((a>b)&&(b>c));
	boolean output2=((a<b)||(c<a));
	boolean output3=!(a>c);
	
	int inc=++a;
	int inc1=b++;
	int dec=--c;
	int dec1=a--;
	
	int prec1=a+b*c;
	int prec2=(a+b)*c;
	int prec3=a/c*b;
	
	System.out.println("Addition:"+add);
	System.out.println("Subtraction:"+sub);
	System.out.println("Multilication:"+mul);
	System.out.println("Division:"+div);
	System.out.println("Equals:"+res1);
	System.out.println("Greater Than:"+res2);
	System.out.println("Lesser Than:"+res3);
	System.out.println("greater than Equal:"+res4);
	System.out.println("less than Equal:"+res5);
	System.out.println("Not Equals:"+res6);
	System.out.println("And operator:"+output1);
	System.out.println("Or operator:"+output2);
	System.out.println("Not operator:"+output3);
	System.out.println("Increment:"+inc);
	System.out.println("Another Increment:"+inc1);
	System.out.println("Decrement:"+dec);
	System.out.println("Another Decrement:"+dec1);
	System.out.println("operator precedence:"+prec1);
	System.out.println("overridden operator precidence:"+prec2);
	System.out.println("operator precedence:"+prec3);
  }
}
