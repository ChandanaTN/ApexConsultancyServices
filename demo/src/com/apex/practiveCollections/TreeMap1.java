package com.apex.practiveCollections;
import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(100, "Amit");
		tm.put(102, "Ravi");
		tm.put(101, "Vijay");
		tm.put(103, "Rahul");
		System.out.println("Before invoking remove() method");
		for(Map.Entry<Integer,String> m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		tm.remove(102);
		System.out.println("After invoking remove() method");
		for(Map.Entry<Integer,String> m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
