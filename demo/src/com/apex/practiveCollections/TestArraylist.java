package com.apex.practiveCollections;
import java.util.*;
import java.io.*;

public class TestArraylist {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");
System.out.println(list);
//Traversing list through Iterator
Iterator<String> itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
//Traversing list through for-each loop
for(String obj:list) {
	System.out.println(obj);}

System.out.println("Traversing list through list iterator:");
ListIterator<String> list1=list.listIterator(list.size());
while(list1.hasPrevious()) {
	System.out.println(list1.previous());
}
 System.out.println("Travesing list through for loop:");
 for(int i=0;i<list.size();i++) {
	 System.out.println(list.get(i));
 }
 System.out.println("Travesing list through forEach() method:");
 list.forEach(a->{System.out.println(a);});
 System.out.println("Traversing list through forEachRemaining() method:");
 Iterator<String> itr1=list.iterator();
 itr1.forEachRemaining(a->
 {
	 System.out.println(a);
	 });
 /*Student st1=new Student(101,"Sonoo",23);
 Student st2=new Student(102,"Ravi",21);
 Student st3=new Student(103,"Hanumat",25);
 ArrayList<Student> al=new ArrayList<Student>();
 al.add(st1);
 al.add(st2);
 al.add(st3);
 Iterator<Student> itrStudent=al.iterator();
 while(itrStudent.hasNext())
 {
	 Student tempStudent=itrStudent.next();
	 System.out.println(tempStudent.rollno+" "+tempStudent.name+" "+tempStudent.age);
 }
 try
 {
	 FileOutputStream fos = new FileOutputStream("file");
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 oos.writeObject(list);
	 fos.close();
	 oos.close();
	 
	 FileInputStream fis = new FileInputStream("file");
	 ObjectInputStream ois = new ObjectInputStream(fis);
	 ArrayList alserdeser=(ArrayList)ois.readObject();
	 System.out.println(alserdeser);
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }*/
	}

}
