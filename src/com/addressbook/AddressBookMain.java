package com.addressbook;

import java.util.Scanner;

/**
 * AddressBook System
 * 
 * @author CHANDRU
 *
 */

public class AddressBookMain {
	private static String lastName;
	private static String firstName;
	private static String city;
	private static String state;
	private static String phNo;
	private static int zip;

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in AddressBookMain class on Master Branch");
		System.out.println("Enter Your First Name");
		Scanner scanner = new Scanner(System.in);
		firstName = scanner.nextLine();
		System.out.println("Enter Your Last Name");
		lastName = scanner.nextLine();
		System.out.println("Enter Your city Name");
		city = scanner.nextLine();
		System.out.println("Enter Your state Name");
		state = scanner.nextLine();
		System.out.println("Enter Your phone Number");
		phNo = scanner.nextLine();
		System.out.println("Enter Your zip");
		zip = scanner.nextInt();
		System.out.println("Added Successfully");

	}

}
