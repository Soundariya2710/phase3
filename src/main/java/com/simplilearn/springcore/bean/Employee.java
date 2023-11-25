package com.simplilearn.springcore.bean;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	
	
	public Employee() {
		System.out.println("defined constructor....");
	}
	
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


 public void displayempinfo() {
	 
	 System.out.println("Employeeid" +id);
	 System.out.println("Employeename" +name);
	 System.out.println("Employeeaddress" +address.toString());
	 
	 
 }
	

}
