package com.cogent.assessment.copy;

public class InterestCalc {
	
	public static void main(String[] args) {
		
		double principal = 100;
		double rate = 3.5;
		int years = 2;
		
		double simpleInterest = (principal * rate * years) / 100;
		System.out.println(simpleInterest);
		
	}

}
