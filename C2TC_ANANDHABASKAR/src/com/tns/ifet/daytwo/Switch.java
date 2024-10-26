package com.tns.ifet.daytwo;

public class Switch {

	public static void main(String[] args)
	{
		char x='d';
		switch (x) 
		{
			case 'l'->System.out.println(x+" is a Letter");
			case 'd'->System.out.println(x+" is a Digit");
			case 'w'->System.out.println(x+" is White Space");
			case 's'->System.out.println(x+" is Special Symbol");
			default->System.out.println(x+" is other than letter, digit, space or special symbol ");
		}
	}
}
