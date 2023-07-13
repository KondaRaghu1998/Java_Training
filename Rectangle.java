package com.drucare.app.task;

public class Rectangle {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	public int area() {
		return (length * breadth);
	}

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2 = new Rectangle(5, 8);
		System.err.println("area of first rectangle :: " + rectangle1.area());
		System.err.println("area of second rectangle :: " + rectangle2.area());

	}

}
