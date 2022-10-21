package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  creating object of AddressBook class
		  calling addContact method and displayContact
		 */
		int choice;
		AddressBook addressBook = new AddressBook();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n**** ADDRESSBOOK SIMULATION ****\n");
			System.out.println("Please Choose an Option");
			System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT ");
			choice = sc.nextInt();
			// performing task according to the choices entered by the User
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.displayContact();
				break;
			case 3:
				addressBook.editContact();
				break;
			default:
				System.out.println("Wrong choice entered !!!!!!");
				System.out.println("Kindly choose the correct Option");
				break;
		
	}
			sc.close();
}
	}
}


