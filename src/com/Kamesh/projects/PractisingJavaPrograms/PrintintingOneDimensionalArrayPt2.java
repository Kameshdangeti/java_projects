package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;
import java.util.Stack;

public class PrintintingOneDimensionalArrayPt2 {
	public static boolean canWin(int leap, int[] game) {
		int n = game.length;
		boolean[] visited = new boolean[n];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		while (!stack.isEmpty()) {
			int current = stack.pop();
			visited[current] = true;
			if (current >= n - 1 || current + leap >= n) {
				return true;
			}
			int nextRight = current + 1;
			if (nextRight < n && game[nextRight] == 0 && !visited[nextRight]) {
				stack.push(nextRight);
			}
			int nextLeap = current + leap;
			if (nextLeap < n && game[nextLeap] == 0 && !visited[nextLeap]) {
				stack.push(nextLeap);
			}
			int nextBack = current - 1;
			if (nextBack >= 0 && game[nextBack] == 0 && !visited[nextBack]) {
				stack.push(nextBack);
			}

		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
