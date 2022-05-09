package com.ques3;

import java.lang.Math. *;
import java.lang.Number.*;

public class Demoo {

	private double a;
	private long b;
	
	public Demoo()
	{
		a=120.0d;
		b=200;
	}
	
	public Demoo(double c, long d)
	{
		a=c;
		b=d;
	}
	
	public boolean isZero()
	{
		if(a==0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPositive()
	{
		if(a>0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isNegative()
	{
		if(a<0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if(a%2 !=0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEven()
	{
		if(a%2==0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		int i, lastn;

		double qq;
		boolean flag;
		qq = Math.sqrt(b);
		lastn = (int)qq;
		flag = true;
		
		for(i=2;i<lastn;i++)
		{
			if(b!=i)
			{
				if(b%i==0)
				{
					flag=false;
					break;
				}
			}
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getfactorial()
	{
		double ww=1;
		for(int i=1;i<=9;i++)
		{
			ww += b%10;
			b /= 10;
		}
		ww+=b;
		return ww;
	}
	
	public void despBinary()
	{
		System.out.println("ByteValue of b :" + Long.toBinaryString(b));
	}
	
	public static void main(String[] args) {
		
		Demoo d1 = new Demoo();
		System.out.println(d1.isZero());
		System.out.println(d1.isNegative());
		System.out.println(d1.isPositive());
		System.out.println(d1.isEven());
		System.out.println(d1.isOdd());
		System.out.println(d1.isPrime());
		System.out.println(d1.getfactorial());
		d1.despBinary();
		
		
		
	}

}
