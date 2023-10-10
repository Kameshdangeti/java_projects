package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;
import java.util.Stack;

public class CreatingJavaStack {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalanced(input));
		}
		sc.close();
	}

	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
          System.out.println("Output :");
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}

}
