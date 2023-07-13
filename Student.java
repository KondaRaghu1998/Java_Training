package com.drucare.app.task;

public class Student {

	String name;

	public Student(String name) {
		this.name = name;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public static void main(String[] args) {

		Student student2 = new Student();
		if (student2.name == null) {
			System.out.println("Unknown");
		}

		System.out.println();

		Student student = new Student("Konda Raghu");
		System.out.println(student);

	}

}
