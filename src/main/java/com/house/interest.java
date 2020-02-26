package com.house;
import java.lang.Math;

public class interest {
	float p,r,t;
	interest(float p,float r,float t){
		this.p=p;
		this.r=r;
		this.t=t;
		
	}
	float simpleInterest() {
		return (p*r*t)/100;
	}
	double compoundInterest() {
		return p*Math.pow((1+r/100),t);
	}
}
