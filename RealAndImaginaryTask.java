package com.drucare.app.task;

import java.util.Scanner;

public class RealAndImaginaryTask {

	double real;
	double imaginary;

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public String toString() {
		return "RealAndImaginaryTask [real=" + real + ", imaginary=" + imaginary + "]";
	}

	public RealAndImaginaryTask(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public RealAndImaginaryTask sum(double real, double imaginary) {

		double realsum = this.real + real;
		double imaginarysum = this.imaginary + imaginary;
		return new RealAndImaginaryTask(realsum, imaginarysum);

	}

	public RealAndImaginaryTask substract(double real, double imaginary) {
		double realsum = this.real - real;
		double imaginarysum = this.imaginary - imaginary;
		return new RealAndImaginaryTask(realsum, imaginarysum);

	}

	public RealAndImaginaryTask product(double real, double imaginary) {

		double realsum = this.real * real;
		double imaginarysum = this.imaginary * imaginary;
		return new RealAndImaginaryTask(realsum, imaginarysum);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the real");
		double real = scanner.nextDouble();
		System.out.println("Enter the imaginary");
		double imaginary = scanner.nextDouble();

		RealAndImaginaryTask andImaginaryTask = new RealAndImaginaryTask(real, imaginary);
		

		System.out.println("Enter the real");
		double reals = scanner.nextDouble();
		System.out.println("Enter the imaginary");
		double imaginarys = scanner.nextDouble();
		
		
		RealAndImaginaryTask sum = andImaginaryTask.sum(reals, imaginarys);
        System.out.println("Sum of real and imaginary :: " + sum.getReal() + " + " + sum.getImaginary() + " i ");
        
        
		RealAndImaginaryTask substract = andImaginaryTask.substract(reals, imaginarys);
		System.out.println("Substract of real and imaginary :: " + substract.getReal() + " + " + substract.getImaginary() + " i ");
		
		RealAndImaginaryTask product = andImaginaryTask.product(reals, imaginarys);
		System.out.println("Product of real and imaginary :: " + product.getReal() + " + " + product.getImaginary() + " i ");
		scanner.close();

	}

}
