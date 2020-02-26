package com.house;

public class HighStandard extends AboveStandard {
	int area;
	HighStandard(int a,int b,int c,boolean t){
		super(a,b);
		area=c;
		if(t)
		updateCost(2500*area);
		else
			updateCost(1800*area);
	}
	public void updateCost(int c) {
		super.updateCost(c);
	}
}
