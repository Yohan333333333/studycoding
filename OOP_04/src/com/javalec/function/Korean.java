package com.javalec.function;

public class Korean {

	// field
	public String name = "";
	public String phone = "";
	public String nation = "대한민국";

	// constructor
	public Korean() {

	}

	public Korean(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		
		printName2();

	}

	// method
	public void printName(String printName, String printphone) {
		System.out.println("nation:" + nation);
		System.out.println("name:" + printName);
		System.out.println("phone:" + printphone);
	}

	public void printName2() {
		System.out.println("nation:" + nation);
		System.out.println("name:" + name);
		System.out.println("phone:" + phone);

	}
}