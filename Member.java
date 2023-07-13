package com.drucare.app.task;

public class Member {

	String name;
	int age;
	long number;
	String address;
	int salary;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, long number, String address, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
		this.salary = salary;
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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int printSalary() {

		return salary;

	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", number=" + number + ", address=" + address + ", salary="
				+ salary + "]";
	}

}
