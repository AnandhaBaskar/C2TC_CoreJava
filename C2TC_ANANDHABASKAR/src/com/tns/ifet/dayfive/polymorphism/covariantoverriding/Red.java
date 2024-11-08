package com.tns.ifet.dayfive.polymorphism.covariantoverriding;

public class Red extends Color {
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}