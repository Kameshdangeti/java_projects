package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class CallByValue3 {
	int change(int b) {
		b++;
		return b;
	}

	public static void main(String[] args) {
		CallByValue3 clv3 = new CallByValue3();
		int a = 30;
		int c = clv3.change(a);
		System.out.println("Value Of A :" + a);
		System.out.println("Value of C :" + c);

	}
}
