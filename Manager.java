package com.drucare.app.task;

public class Manager extends Member {

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

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", department=" + department + "]";
	}

	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.setName("Arun");
		manager.setAge(25);
		manager.setNumber(8974241485L);
		manager.setAddress("HYD");
		manager.setSpecialization("Project Manager");
		manager.setDepartment("IT");
		manager.setSalary(150000);
		System.err.println("Manager Details...!!!");
		System.out.println("Manager Name :: " + manager.getName());
		System.out.println("Manager Age :: " + manager.getAge());
		System.out.println("Manager Number :: " + manager.getNumber());
		System.out.println("Manager Address :: " + manager.getAddress());
		System.out.println("Manager Number :: " + manager.getNumber());
		System.out.println("Manager Specialization :: " + manager.getSpecialization());
		System.out.println("Manager Department :: " + manager.getDepartment());

		System.out.println("Manager Salary :: " + manager.printSalary());

	}

}
