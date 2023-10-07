package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptions3 {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f3 = new FileInputStream("ghi.java");
			f3.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		}
	}
}
