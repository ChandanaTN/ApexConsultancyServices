package com.apex.practiveCollections;

public class Student implements Comparable<Student>{
	int rollno;
	public String name;
	int age;
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student st) {
		if (age==st.age)
			return 0;
		else if (age>st.age)
			return 1;
		else
			return -1;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*public Student(String name) {
		this.name = name;
	}
	public int compareTo(Student person) {
		return name.compareTo(person.name);
	}*/

}
