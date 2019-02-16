package com.apex.practiveCollections;
import java.util.*;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> set= new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial set: "+set);
		System.out.println("Reverse set: "+set.descendingSet());
		System.out.println("Head set: "+set.headSet("C", true));
		System.out.println("Subset: "+set.subSet("A", false, "E", true));
		System.out.println("Tail set: "+set.tailSet("C", false));
		System.out.println("Head set: "+set.headSet("C"));
		System.out.println("Subset: "+set.subSet("A", "E"));
		System.out.println("Tail set: "+set.tailSet("C"));
	}

}
