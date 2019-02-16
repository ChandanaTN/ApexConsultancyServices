package com.apex.assignment1;
import java.util.*;

public class PerformCalculation {

	public static void main(String[] args) {
		try
		{
			double result=0;
			System.out.println("Please enter the first number for calculation: ");
			Scanner reader=new Scanner(System.in);
			Double number1=reader.nextDouble();
			
			System.out.println("Please enter the second number for calculation: ");
			Double number2=reader.nextDouble();
			
			System.out.println("Please enter the operation to be performed(+,-,*,/): ");
			String operation=reader.next();
			reader.close();
			
			BasicCalculator bc=new BasicCalculator();
			result=bc.calculate(number1, number2, operation);
			System.out.println("The result is: "+result);
		}
		catch(Exception e)
		{
			System.out.println("Oops!" +e+" occured.");
		}
	}

}
