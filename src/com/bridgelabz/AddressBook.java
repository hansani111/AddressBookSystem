package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);

    //Taking arraylist to save the contact details
    static ArrayList<Contact> addressbook = new ArrayList<>();

    //Creating contact with this method
    static Contact addContactDetails() {
        Contact contact = new Contact();

        System.out.println("Enter Firstname : ");
        contact.setFirstName(sc.next());

        System.out.println("Enter lastname : ");
        contact.setLastName(sc.next());

        System.out.println("Enter address : ");
        contact.setAddress(sc.next());

        System.out.println("Enter city : ");
        contact.setCity(sc.next());

        System.out.println("Enter state : ");
        contact.setState(sc.next());

        System.out.println("Enter zip : ");
        contact.setZip(sc.next());

        System.out.println("Enter phoneNumber : ");
        contact.setPhoneNumber(sc.next());

        System.out.println("Enter email : ");
        contact.setEmail(sc.next());

        addressbook.add(contact);        //storing the contact details in arraylist

        System.out.println();
        System.out.println(addressbook);

        return contact;
    }

    public static void main(String[] args) {
        addContactDetails();
    }
}