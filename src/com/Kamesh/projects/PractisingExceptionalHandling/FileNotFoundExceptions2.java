package com.Kamesh.projects.PractisingExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptions2 {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f2 = new FileInputStream("def.java");
			f2.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		}
	}
}
