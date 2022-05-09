package com.ques2;
import java.io.*;
public class BufferExample {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream a = new ByteArrayOutputStream(12);
		System.out.println("Enter the value");
		while(a.size()!=10)
		{
			a.write(System.in.read());
		}
		byte b[] = a.toByteArray();
		System.out.println("Displaying the value");
		for(int i=0;i<b.length;i++)
		{
			System.out.println((char)b[i]);
		}
		ByteArrayInputStream inp = new ByteArrayInputStream(b);
		int c;
		for (int i=0;i<1;i++)
		{
			while((c=inp.read()) != -1)
			{
				System.out.print(Character.toUpperCase((char)c));
			}
			System.out.println();
			inp.reset();
		}
		}
	}

