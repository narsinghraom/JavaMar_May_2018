package com.vtalent.maheshreddy;

public class Sampleone {
	float f1, f2;

	public void function(float f1) {
		this.f1 = f1 + f2;
	}

	public void function(float f1, float f2) {
		this.f1 = this.f1 + f1;
		this.f2 = this.f2 + f2;
	}
}