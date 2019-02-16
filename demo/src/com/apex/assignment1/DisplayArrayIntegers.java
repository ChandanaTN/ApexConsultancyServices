package com.apex.assignment1;
import java.util.*;

public class DisplayArrayIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(202);
		list.add(303);
		list.add(404);
		list.add(505);
		list.add(606);
		list.add(707);
		list.add(808);
		list.add(909);
		list.add(111);
		
		for(Integer number:list)
		{
			System.out.println(list.indexOf(number)+" "+number);
		}

	}

}
