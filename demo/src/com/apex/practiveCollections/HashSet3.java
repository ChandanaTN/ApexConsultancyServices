package com.apex.practiveCollections;
import java.util.*;

public class HashSet3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
		HashSet<String> set= new HashSet<String>(list);
		set.add("Gaurav");
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
