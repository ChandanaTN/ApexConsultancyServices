package com.apex.practiveCollections;
import java.util.*;

class TestArrayListBook {
	int id;
	String name,author,publisher;
	int quantity;
	public TestArrayListBook(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayListExample{
	public static void main(String args[]) {
		List<TestArrayListBook> list= new ArrayList<TestArrayListBook> ();
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
