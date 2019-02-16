package com.apex.practiveCollections;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		List<TestArrayListBook> list= new LinkedList<TestArrayListBook> ();
		TestArrayListBook b1= new TestArrayListBook(101,"Let us C","Yashwant Kanetkar","BPB",8);
		TestArrayListBook b2= new TestArrayListBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		TestArrayListBook b3= new TestArrayListBook(103,"Operating System","Galvin","Wiley",6);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for (TestArrayListBook b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
