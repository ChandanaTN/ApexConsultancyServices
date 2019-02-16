package com.apex.assignment1;

public class TypeCheck {

	public static void main(String[] args) {
		if(IsInteger("65as"))
			System.out.println("Input string is an integer");
		else
			System.out.println("Input string is not an integer");
		if(IsOddNumber("25"))
			System.out.println("Input string is an odd number");
		else
			System.out.println("Input string is not an odd number");
		if(IsEvenNumber("36"))
			System.out.println("Input string is an even number");
		else
			System.out.println("Input string is not an even number");
		if(!IsPrimeNumber("28"))
			System.out.println("Input string is a prime number");
		else
			System.out.println("Input string is not a prime number");
		
	}
	public static boolean IsInteger(String str)
	{
		try
		{
			Integer.parseInt(str);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public static boolean IsOddNumber(String str)
	{
		try
		{
			int number=Integer.parseInt(str);
			if (number%2==0)
				return false;
			else
				return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
	}
	public static boolean IsEvenNumber(String str)
	{
		try
		{
			int number=Integer.parseInt(str);
			if (number%2==0)
				return true;
			else
				return false;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	public static boolean IsPrimeNumber(String str)
	{
		try
		{
			int number=Integer.parseInt(str);
			boolean numberIsPrime=false;
			for(int i=2;i<=number/2;++i)
			{
				if(number%i==0)
				{
					numberIsPrime=true;
					break;
				}
			}		
			return numberIsPrime;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

}
