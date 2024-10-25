package com.tns.ifet.daytwo;

public class ContinueDemo {

	public static void main(String[] args)
	{
		for (int k=1;k<20;k++)
		{
		if (k%2!=0)
			continue;
		System.out.print(k+" ");
		}
	}
}
