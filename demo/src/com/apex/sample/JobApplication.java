package com.apex.sample;

public class JobApplication {
private String firstName,lastName;
private int year;
private final static String COMPANY_NAME="Google";

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	if(this.year<0) this.year=1990;
	else
	this.year = year;
}


JobApplication(){
	
}

JobApplication(String firstName,String lastName,int year){
	this.firstName=firstName;
	this.lastName=lastName;
	this.year=year;
}

void display() {
	System.out.println("First Name: "+firstName);
	System.out.println("Last Name: "+lastName);
	System.out.println("Year: "+year);
}
}
