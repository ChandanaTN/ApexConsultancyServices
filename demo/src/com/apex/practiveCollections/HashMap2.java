package com.apex.practiveCollections;
import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(103, "Gaurav");
		System.out.println("Initial list of elements: "+hm);
		hm.remove(100);
		System.out.println("Updated list of elements: "+hm);
		hm.remove(101);
		System.out.println("Updated list of elements: "+hm);
		hm.remove(102, "Rahul");
		System.out.println("Updated list of elements: "+hm);
	}

}
