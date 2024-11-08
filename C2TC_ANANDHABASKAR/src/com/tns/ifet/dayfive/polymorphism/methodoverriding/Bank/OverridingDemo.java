package com.tns.ifet.dayfive.polymorphism.methodoverriding.Bank;

public class OverridingDemo {

	public static void main(String[] args) {
			RBI rbi;
			
			rbi = new SBI();
			System.out.println(rbi.getRateOfInterest());

			rbi = new ICICI();
			System.out.println(rbi.getRateOfInterest());

			rbi = new HDFC();
			System.out.println(rbi.getRateOfInterest());
			
			RBI rbi1=new SBI();
			System.out.println(rbi1.getRateOfInterest());
			
//			RBI rbi1=new SBI();
//			System.out.println(rbi1.getRateOfInterest());
			
//			RBI rbi1=new HDFC();
//			System.out.println(rbi1.getRateOfInterest());
			
			RBI rbi2=new ICICI();
			System.out.println(rbi2.getRateOfInterest());
			
			rbi2=new HDFC();
			System.out.println(rbi2.getRateOfInterest());
			

		}

}
