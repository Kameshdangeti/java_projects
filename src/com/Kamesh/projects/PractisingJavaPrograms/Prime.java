package com.Kamesh.projects.PractisingJavaPrograms;

public class Prime {
	void checkPrime(int... num) {
		for (int i = 0; i < num.length; i++) {
			boolean checker = true;
			if (num[i] > 1) {
				for (int j = 2; j * j <= num[i]; j++) {
					if (num[i] % j == 0) {
						checker = false;
						break;
					}
					checker = true;
				}
				if (checker) {
					System.out.print(num[i] + " ");
				}
			}
		}
		System.out.println();

	}
}
