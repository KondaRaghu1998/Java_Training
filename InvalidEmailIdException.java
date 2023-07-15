package com.drucare.app.exception;

import java.util.Scanner;

public class InvalidEmailIdException extends RuntimeException {
	public InvalidEmailIdException(String msg) {
		super(msg);
	}

	@SuppressWarnings("resource")
	public static void invalidEmailIdException() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email id");
		String emailId = scanner.nextLine();

		if (!emailId.contains("@")) {
			try {
				throw new InvalidEmailIdException("The email id you're checking doesn't have '@' in it......!!!!");
			} catch (InvalidEmailIdException emailIdException) {
				System.out.println( emailIdException);
			}

		} else {
			System.out.println("Given email id valid...!!!");
		}

		scanner.close();
	}

}
