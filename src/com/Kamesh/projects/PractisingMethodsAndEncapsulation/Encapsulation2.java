package com.Kamesh.projects.PractisingMethodsAndEncapsulation;

public class Encapsulation2 {
	private String password;

	public void setpassword(String password) {
		if (password.length() >= 8) {
			System.out.println("Your password is set successfully");
		} else {
			System.out.println("Invalid password");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
