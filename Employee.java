package com.drucare.app.task;

public class Employee extends Member {

	String specialization;
	String department;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Konda Raghu");
		employee.setAge(24);
		employee.setNumber(8374241485L);
		employee.setAddress("HYD");
		employee.setSalary(23000);
		employee.setSpecialization("Java Developer");
		employee.setDepartment("IT");
		System.err.println("Employee Details...!!!");
		System.out.println("Employee Name :: " + employee.getName());
		System.out.println("Employee Age :: " + employee.getAge());
		System.out.println("Employee Number :: " + employee.getNumber());
		System.out.println("Employee Address :: " + employee.getAddress());

		System.out.println("Employee Specialization :: " + employee.getSpecialization());
		System.out.println("Employee Department :: " + employee.getDepartment());
		System.out.println("Employee salary ::  " + employee.printSalary());

	}

}
