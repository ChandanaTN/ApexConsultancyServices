package com.apex.practiveCollections;
import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Highest Value: "+set.pollLast());
		System.out.println("Lowest Value: "+set.pollFirst());
	}

}
