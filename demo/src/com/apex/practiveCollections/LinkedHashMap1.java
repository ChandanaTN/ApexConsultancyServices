package com.apex.practiveCollections;
import java.util.*;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(100, "Amit");
		lhm.put(101, "Vijay");
		lhm.put(102, "Rahul");
		System.out.println("Keys: "+lhm.keySet());
		System.out.println("Values: "+lhm.values());
		System.out.println("Key-Value pairs: "+lhm.entrySet());
		System.out.println("Before invoking remove() method: "+lhm);
		lhm.remove(102);
		System.out.println("After invoking remove() method: "+lhm);
	}

}
