package com.drucare.app.exception;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmailIdNotFoundException extends Exception {

	public EmailIdNotFoundException(String msg) {
		super(msg);
	}

	@SuppressWarnings("resource")
	public static void emailIdNotFoundException() throws EmailIdNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email id");
		String emailId = scanner.nextLine();

		List<String> list = Arrays.asList("kondaraghu@gmail.com", "kondashiva@gmail.com", "arun@gmail.com",
				"hemanth@gmail.com");

		if (!list.contains(emailId)) {

			try {
				throw new EmailIdNotFoundException("Email Id Not Found in given list....!!!!");
			} catch (EmailIdNotFoundException emailIdNotFoundException) {
				System.out.println(emailIdNotFoundException);
			}

		} else {
			System.out.println("Given Email id present in the list " + list);
		}

		scanner.close();

	}

}
