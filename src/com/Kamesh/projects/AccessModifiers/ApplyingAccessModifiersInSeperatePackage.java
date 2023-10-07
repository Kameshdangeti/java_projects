//Below we written the code in different package and called in different class.\
//so,we can get output for only  the public int.Because,As we know private canspecify within the class.
//And protected cannot be accessed because,code is written in the different package.And we all knew default,
//is only accessed within the package.
//This code is Related to "ApplyingAccessModifiers.java".
package com.Kamesh.projects.AccessModifiers;

import com.Kamesh.projects.MethodsAndEncapsulation.ApplyingAccessModifiers;

public class ApplyingAccessModifiersInSeperatePackage {
	public static void main(String[] args) {
		ApplyingAccessModifiers s1 = new ApplyingAccessModifiers();
		System.out.println(s1.i);
		// System.out.println(s1.d); //Doesn't get Output.
		// System.out.println(s1.ch); //Doesn't get Output.
		// System.out.println(s1.b); //Doesn't get Output.
	}
}
