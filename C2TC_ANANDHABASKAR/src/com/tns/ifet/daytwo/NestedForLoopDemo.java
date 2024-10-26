package com.tns.ifet.daytwo;

public class NestedForLoopDemo {

	public static void main(String[] args)
	{
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=10;j++)
			{
				System.out.println(j+"*"+i+"= "+i*j);
			}
			System.out.println();
		}

	}

}
