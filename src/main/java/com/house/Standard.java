package com.house;

public class Standard extends house{
	int area;
	Standard(int a){
		area = a;
		updateCost(1200*area);
	}
	public void updateCost(int c) {
		super.updateCost(c);
	}
}
