package com.apex.practiveCollections;
import java.util.*;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(100, "Amit");
		ht.put(102, "Ravi");
		ht.put(101, "Vijay");
		ht.put(103, "Rahul");
		for(Map.Entry<Integer,String> m:ht.entrySet() ) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Before invoking the remove() method: "+ht);
		ht.remove(102);
		System.out.println("After invoking the remove() method: "+ht);
		System.out.println(ht.getOrDefault(101, "Not found"));
		System.out.println(ht.getOrDefault(105, "Not found"));
		System.out.println("Initial map: "+ht);
		ht.putIfAbsent(104, "Gaurav");
		System.out.println("Updated map: "+ht);
		ht.putIfAbsent(101, "Vijay");
		System.out.println("Updated map: "+ht);
	}

}
