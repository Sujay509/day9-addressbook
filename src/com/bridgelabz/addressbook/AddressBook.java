package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	ArrayList<Contact> contactArrayList = new ArrayList<Contact>(); 
	Scanner sc = new Scanner(System.in);
	// creating object of Contact class
	Contact contact = new Contact();
	
	public void addContact() {
		/*
		  taking all details from user using scanner function
		 */
		System.out.println("Enter the First Name :");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name :");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address :");
		contact.setAdddress(sc.next());
		System.out.println("Enter the City :");
		contact.setCity(sc.next());
		System.out.println("Enter the State :");
		contact.setState(sc.next());
		System.out.println("Enter the Zip code :");
		contact.setZipCode(sc.next());
		System.out.println("Enter the Mobile Number :");
		contact.setMobileNumber(sc.next());
		System.out.println("Enter the Email id :");
		contact.setEmail(sc.next());
	}
	
	public void displayContact() {
		
		System.out.println("\n     New Contact    ");
		System.out.println("----------------------");
		System.out.println("First Name    : " + contact.getFirstName());
		System.out.println("Last Name     : " + contact.getLastName());
		System.out.println("Address       : " + contact.getAdddress());
		System.out.println("City          : " + contact.getCity());
		System.out.println("State         : " + contact.getState());
		System.out.println("Zip code      : " + contact.getZipCode());
		System.out.println("Mobile Number : " + contact.getMobileNumber());
		System.out.println("Email id      : " + contact.getEmail());
	}
	
	public void editContact() {
		// editing the existing contact using their First Name
		System.out.println("Enter the First Name of Contact to Edit");
		String firstName = sc.next();
		boolean isAvailable = false ;
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equals(firstName)) {
				isAvailable = true ;
				System.out.println("What you want to edit for the contact");
				System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7.Mobile Number\n8.Email id");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the First Name :");
					contact.setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter the Last Name :");
					contact.setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter the Address :");
					contact.setAdddress(sc.next());
					break;
				case 4:
					System.out.println("Enter the City :");
					contact.setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter the State :");
					contact.setState(sc.next());
					break;
				case 6:
					System.out.println("Enter the Zip code :");
					contact.setZipCode(sc.next());
					break;
				case 7:
					System.out.println("Enter the Mobile Number :");
					contact.setMobileNumber(sc.next());
					break;
				case 8:
					System.out.println("Enter the Email id :");
					contact.setEmail(sc.next());
					break;
				}
				System.out.println("Updated Sucessfully ...");
			}
		}
		if(isAvailable == false){
			System.out.println("Contact is not Available \nTry again");
		}
	}
}

