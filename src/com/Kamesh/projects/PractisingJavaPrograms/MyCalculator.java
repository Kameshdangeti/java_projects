package com.Kamesh.projects.PractisingJavaPrograms;

public class MyCalculator {
	long power(int n, int p) throws Exception {
		long m = n;
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");

		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}

		else {

			if (p == 0 && n != 0) {
				return 1;
			}

			for (int i = 1; i < p; i++) {
				m = n * m;
			}

			return m;
		}
	}
}
