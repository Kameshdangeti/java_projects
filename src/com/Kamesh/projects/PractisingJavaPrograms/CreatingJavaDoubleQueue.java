package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CreatingJavaDoubleQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		System.out.println("Enter the N values :");
		int n = sc.nextInt();
		System.out.println("Enter the M values :");
		int m = sc.nextInt();

		int[] dp = new int[10000001];
		int current = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (deque.size() == m) {
				int temp = deque.poll();
				if (dp[temp] == 1) {
					current--;
				}
				dp[temp] -= 1;
			}

			if (dp[num] == 0) {
				current++;
			}
			dp[num] += 1;
			deque.add(num);
			max = Math.max(max, current);
		}
		System.out.println("Maximum no of Unique Integers are :" + max);
		sc.close();
	}
}
