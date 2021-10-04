package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * AddressBook System
 * 
 * @author CHANDRU
 *
 */

class Person {
	String firstName;
	String lastName;
	String city, state;
	int zip;
	int phNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhNo() {
		return phNo;
	}

	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}

	public String toString() {
		return "\n firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", city='" + city + '\''
				+ ", state='" + state + '\'' + ", zip=" + zip + ", phNo='" + phNo + '\'';
	}
}

class PersonMethods extends Person {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> person = new ArrayList<>();

	public void createPerson() {
		Person person1 = new Person();
		System.out.println("Enter your First Name");
		person1.firstName = sc.nextLine();
		System.out.println("Enter your Last Name");
		person1.lastName = sc.nextLine();
		System.out.println("Enter your City");
		person1.city = sc.nextLine();
		System.out.println("Enter your state");
		person1.state = sc.nextLine();
		System.out.println("Enter your Zip");
		person1.zip = sc.nextInt();
		System.out.println("Enter your Phone Number");
		person1.phNo = sc.nextInt();
		System.out.println("Added Successfully");
		person.add(person1);

	}

	public void UpdatePerson(String name, String update) {

		int flag = 0;
		for (Person p : person) {
			if (p.firstName.equals(name)) {
				flag = 1;
				switch (update) {
				case "city":
					System.out.println("Enter city name to update:");
					p.city = sc.nextLine();
					break;
				case "state":
					System.out.println("Enter state name to update:");
					p.state = sc.nextLine();
					break;
				case "phone":
					System.out.println("Enter phone number to update:");
					p.phNo = sc.nextInt();
					break;
				case "zip":
					System.out.println("Enter Your zip");
					p.zip = sc.nextInt();
					break;
				}
			}
		}
		if (flag == 0)
			System.out.println("Person Not Found");
		else
			System.out.println("Updated Successfully");

	}

	public void viewPerson() {
		for (Person p : person) {
			System.out.println(p);
		}

	}

	public void DeletePerson(String n) {
		int flag = 0;
		Iterator<Person> itr = person.iterator();
		while (itr.hasNext()) {
			Person person = itr.next();
			if (person.firstName.equals(n)) {
				flag = 1;
				itr.remove();

			}
			if (flag == 0)

				System.out.println("Person Not found");
			else
				System.out.println("Deleted Person");

		}
	}

}

public class AddressBookMain {
	public static void main(String args[]) {
		int choice = 1, person_count, i;
		Scanner s = new Scanner(System.in);
		PersonMethods personmethods = new PersonMethods();
		while (choice != 0) {
			System.out.println("1.Add Person\n2.Edit Person\n3.Delete Person\n4.Display Person");
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Number of persons:");
				person_count = s.nextInt();
				for (i = 0; i < person_count; i++) {
					personmethods.createPerson();
				}
				break;
			case 2:
				System.out.println("Enter name of person to Update");
				String name = s.next();
				System.out.println("Enter what to update(city/state/phone/zip):");
				String update = s.next();
				personmethods.UpdatePerson(name, update);
				break;
			case 3:
				System.out.println("Enter name of person to Delete");
				String n = s.next();
				personmethods.DeletePerson(n);
				break;
			case 4:
				personmethods.viewPerson();
				break;
			default:
				break;
			}
		}
	}

}
