package com.apex.practiveCollections;
import java.util.*;

public class TestSort3 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(105,"Jai",21));
		//al.add(new Student("Tahir"));
		Collections.sort(al);
		for(Student s:al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		Comparator<Student> cm1=Comparator.comparing(Student::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by name");
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		Comparator<Student> cm2=Comparator.comparing(Student::getAge);
		Collections.sort(al, cm2);
		System.out.println("Sorting by age");
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
