package com.Kamesh.projects.PractisingJavaPrograms;

public interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}
