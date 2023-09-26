//Below we can see the code for creation of methods and with arguments and return values.
//And Method Overloading.
//The main method of this code is called in seperate class i.e., "AddIntAndReturnAValueAndOverloadMethodMain.java".
package com.Kamesh.projects.MethodsAndEncapsulation;
import java.io.*;
public class AddIntAndReturnAValueAndOverloadMethod 
{
		public  int sum(int a1,int a2)
		{ 
			int sum= a1+a2;
			return sum  ;                             //return values.
		}
		public int sum(int a1,int a2,int a3)           //Method Overloading.
		{
			int sum=a1+a2+a3;
			return sum;
		}
}
