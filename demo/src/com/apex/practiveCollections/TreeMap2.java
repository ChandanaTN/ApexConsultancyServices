package com.apex.practiveCollections;
import java.util.*;

public class TreeMap2 {

	public static void main(String[] args) {
		NavigableMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(100, "Amit");
		tm.put(102, "Ravi");
		tm.put(101, "Vijay");
		tm.put(103, "Rahul");
		System.out.println("descending map: "+tm.descendingMap());
		System.out.println("headMap: "+tm.headMap(102, true));
		System.out.println("tailMap: "+tm.tailMap(102, true));
		System.out.println("subMap: "+tm.subMap(100, false, 102, true));
		System.out.println("headMap: "+tm.headMap(102));
		System.out.println("tailMap: "+tm.tailMap(102));
		System.out.println("subMap: "+tm.subMap(100, 102));
	}

}
