package com.house;

public class AboveStandard extends Standard{
int area;
AboveStandard(int a,int b){
	super(a);
	area=b;
	updateCost(1500*area);
}
public void updateCost(int c) {
	super.updateCost(c);
}
}
