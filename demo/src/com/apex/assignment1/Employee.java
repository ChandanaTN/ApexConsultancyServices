package com.apex.assignment1;

public class Employee {
	int empNo,experienceInYears,basic,hra;
	String empName,address,State,designation,emailAddress;
	int zipCode;
	String phone;
	float bonus;

	public Employee(int empNo, int experienceInYears, int basic, int hra, float bonus, String empName, String address,
			String state, String designation, String emailAddress, int zipCode, String phone) {
		this.empNo = empNo;
		this.experienceInYears = experienceInYears;
		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
		this.empName = empName;
		this.address = address;
		this.State = state;
		this.designation = designation;
		this.emailAddress = emailAddress;
		this.zipCode = zipCode;
		this.phone = phone;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public double total_salary(int basic,int hra, int bonus)
	{
		return (basic+hra+(bonus/100.0)*basic);
	}
	
	public static void main(String args[]) {
		Employee employee=new Employee(456890,4,50000,500,5, "Harsha","456,Ring road,Fremont-478569",
			"California","Manager","harsha_12@gmail.com",852369,"4125637809");
		System.out.println(employee.total_salary(50000,500,5));
	}
}
