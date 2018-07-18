package com.vtalent.maheshreddy;

public class Sampletwo extends Sampleone {
	int i;
	float f1;

	public void function(int i) {
		this.i = i + i;
	}

	public void function(float f1) {
		this.f1 = f1 + super.f1;
	}
}