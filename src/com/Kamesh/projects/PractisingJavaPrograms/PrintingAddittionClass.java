package com.Kamesh.projects.PractisingJavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class PrintingAddittionClass {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter n1 value :");
			int n1 = Integer.parseInt(br.readLine());
			System.out.println("Enter n2 value :");
			int n2 = Integer.parseInt(br.readLine());
			System.out.println("Enter n3 value :");
			int n3 = Integer.parseInt(br.readLine());
			System.out.println("Enter n4 value :");
			int n4 = Integer.parseInt(br.readLine());
			System.out.println("Enter n5 value :");
			int n5 = Integer.parseInt(br.readLine());
			System.out.println("Enter n6 value :");
			int n6 = Integer.parseInt(br.readLine());
			Add ob = new Add();
			System.out.println("Addition of Integer are :");
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
			Method[] methods = Add.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
