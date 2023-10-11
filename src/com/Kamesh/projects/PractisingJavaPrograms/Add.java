package com.Kamesh.projects.PractisingJavaPrograms;

public class Add {
	public void add(int... n) {
		int sum = 0;
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
			if (i < n.length - 1) {
				s.append(n[i]);
				s.append("+");
			} else
				s.append(n[i]);
		}

		System.out.print(s + "=" + sum + "\n");
	}

}
