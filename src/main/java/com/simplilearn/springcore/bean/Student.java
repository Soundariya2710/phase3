package com.simplilearn.springcore.bean;

public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public void Studentdisplayinfo() {
		
		System.out.println("Hello \t"  +  name);
	}

}
