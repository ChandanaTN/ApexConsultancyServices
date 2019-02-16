package com.apex.practiveCollections;
import java.util.*;

public class TestArrayListSetGet {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("Before update: "+al.get(1));
		al.set(1, "Gaurav");
		System.out.println("After update: "+al.get(1));
	}

}
