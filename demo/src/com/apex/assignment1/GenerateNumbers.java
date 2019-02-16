package com.apex.assignment1;
import java.util.*;

public class GenerateNumbers {

	public static void main(String[] args) {
		list_Of_1000_Num();
		multiples_Of_5();
		odd_Numbers();
	}
	
	public static void list_Of_1000_Num()
	{
		int number=1;
		List<Integer> list1000=new LinkedList<Integer>();
		while(number<=1000)
		{
			list1000.add(number);
			number++;
		}
		System.out.println("List of 1000 numbers: "+list1000);
	}
	
	public static void multiples_Of_5()
	{
		ArrayList<Integer> listMultiple5=new ArrayList<Integer>();
		for(int num=1;num<=1000;num++)
		{
			if((num%5)==0) {
			listMultiple5.add(num);
			}
		}
		System.out.println("Multiples of 5 and less than 1000: "+listMultiple5);
	}
	
	public static void odd_Numbers()
	{
		ArrayList<Integer> oddList=new ArrayList<Integer>();
		for(int num=1;num<=1000;num++)
		{
			if((num%2)==0) {
				oddList.add(num);
			}
		}
		System.out.println("Odd numbers less than 1000: "+oddList);
	}

}
