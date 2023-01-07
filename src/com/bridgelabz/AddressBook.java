package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);

    //Taking arraylist to save the contact details
    static ArrayList<Contact> addressbook = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("welcome to address book problems");

        System.out.println("Enter Firstname : ");
        String firstName = sc.next();
        System.out.println("Enter lastname : ");
        String lastName = sc.next();
        System.out.println("Enter address : ");
        String address = sc.next();
        System.out.println("Enter city : ");
        String city = sc.next();
        System.out.println("Enter state : ");
        String state = sc.next();
        System.out.println("Enter zip : ");
        String zip = sc.next();
        System.out.println("Enter phoneNumber : ");
        String phoneNumber = sc.next();
        System.out.println("Enter email : ");
        String email = sc.next();

        Contact contact1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressbook.add(contact1);
        System.out.println(addressbook);
    }
}