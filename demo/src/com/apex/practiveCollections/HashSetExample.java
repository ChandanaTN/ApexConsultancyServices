package com.apex.practiveCollections;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<TestArrayListBook> set= new HashSet<TestArrayListBook> ();
		TestArrayListBook b1= new TestArrayListBook(101,"Let us C","Yashwant Kanetkar","BPB",8);
		TestArrayListBook b2= new TestArrayListBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		TestArrayListBook b3= new TestArrayListBook(103,"Operating System","Galvin","Wiley",6);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for (TestArrayListBook b:set) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}

	}

}
