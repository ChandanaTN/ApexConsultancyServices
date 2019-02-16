package com.apex.practiveCollections;
import java.util.*;

public class EnumMapExampleBook {

	public enum Key{
		One,Two,Three
	}
	public static void main(String[] args) {
		EnumMap<Key,Book> map=new EnumMap<Key,Book>(Key.class);
		Book b1= new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2= new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3= new Book(103,"Operating System","Galvin","Wiley",6);
		map.put(Key.One, b1);
		map.put(Key.Two, b2);
		map.put(Key.Three, b3);
		for(Map.Entry<Key,Book> m:map.entrySet()) {
			Book b=m.getValue();
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
