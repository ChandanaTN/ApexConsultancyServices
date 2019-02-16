package com.apex.practiveCollections;
import java.util.*;

public class TestArrayListIsEmpty {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList empty: "+al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After insertion");
		System.out.println("Is ArrayList empty: "+al.isEmpty());

	}

}
