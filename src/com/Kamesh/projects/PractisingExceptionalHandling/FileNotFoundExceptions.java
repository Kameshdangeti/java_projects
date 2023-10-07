package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptions {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f1 = new FileInputStream("Abcd.java");
			f1.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		}
	}
}
