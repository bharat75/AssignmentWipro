package com.ques1;
import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File f1 = new File("C:\\java", "abc.txt") ;
		System.out.println("File name : " + f1.getName());
		System.out.println("File path : "+ f1.getPath());
		System.out.println("Absolute path : " + f1.getAbsolutePath());
		if(f1.exists())
		{
			System.out.println("This File Exists !!!");
		}
		else
		{
			System.out.println("This file does not exists !!!");
		}
		if(f1.isDirectory())
		{
			System.out.println("This file is a directory !!!");
		}
		else
		{
			System.out.println("This file is not a directory");
		}
		if(f1.isFile())
		{
			System.out.println("This is an ordinary file.");
		}
		else
		{
			System.out.println("This can be named piped");
		}
	}

}
