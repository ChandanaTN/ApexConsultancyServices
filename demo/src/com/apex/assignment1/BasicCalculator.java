package com.apex.assignment1;

public class BasicCalculator {

	Double number1=0.0;
	Double number2=0.0;
	String operation;
	
	
	
	public BasicCalculator() {}

	public BasicCalculator(Double number1, Double number2) 
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public double calculate(Double number1,Double number2,String operation)
	{
		switch(operation)
		{
			case "+":
				return number1+number2;
			case "-":
				return number1-number2;
			case "*":
				return number1*number2;
			case "/":
				return number1/number2;
			default:
				return 0;
		}
	}

}
