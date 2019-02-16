package com.apex.practiveCollections;
import java.util.*;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Viru");
		list.add("Saurav");
		list.add("Mukesh");
		list.add("Tahir");
		//Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
