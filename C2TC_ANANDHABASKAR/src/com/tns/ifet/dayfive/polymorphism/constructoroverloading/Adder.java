package com.tns.ifet.dayfive.polymorphism.constructoroverloading;

public class Adder {
	private float x;
	private float y;

	public Adder() {
		x = 0.0f;
		y = 0.0f;
	}

	public Adder(float x) {
		this.x = x;
		this.y = x;
	}

	public Adder(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Adder [x=" + x + ", y=" + y + "x+y="+(x+y)+"]";
	}
	

}
