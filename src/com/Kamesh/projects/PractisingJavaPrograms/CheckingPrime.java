package com.Kamesh.projects.PractisingJavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckingPrime {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Prime p = new Prime();
		ArrayList<Integer> arr = new ArrayList<>();
		int[] array;
		for (int i = 0; i < 5; i++) {
			Integer v = Integer.valueOf(br.readLine());
			arr.add(v);

			if (i == 3)
				continue;
			array = arr.stream().mapToInt(Integer::intValue).toArray();
			p.checkPrime((int[]) array);
		}
	}
}
