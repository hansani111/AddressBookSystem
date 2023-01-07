package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);

    /* Taking arraylist to save the contacts */
    static ArrayList<Contact> addressbook = new ArrayList<>();

    /*Creating contact with this method */
    static void addContactDetails() {
        Contact contact = new Contact();

        System.out.println("Enter Firstname : ");
        contact.setFirstName(sc.next());

        System.out.println("Enter Lastname : ");
        contact.setLastName(sc.next());

        System.out.println("Enter Address : ");
        contact.setAddress(sc.next());

        System.out.println("Enter City : ");
        contact.setCity(sc.next());

        System.out.println("Enter State : ");
        contact.setState(sc.next());

        System.out.println("Enter ZIP : ");
        contact.setZip(sc.next());

        System.out.println("Enter PhoneNumber : ");
        contact.setPhoneNumber(sc.next());

        System.out.println("Enter Email : ");
        contact.setEmail(sc.next());

        addressbook.add(contact);        //storing the contact details in arraylist

        System.out.println();
        System.out.println(addressbook);
    }

    /* edit the contact */
    static void editContactDetails() {
        System.out.println("Enter the Firstname of the contact which you want to edit :  ");
        String name = sc.next();

        for (int person = 0; person < addressbook.size(); person++) {            //for all the contacts in the arraylist
            if (addressbook.get(person).getFirstName().equals(name)) {
                System.out.println("Please select any one option(1-8) to change the contact details \nPRESS1 to edit FirstName \nPRESS2 to edit Lastname \nPRESS3 to edit Address"
                        + "\nPRESS4 to edit City \nPRESS5 to edit State \nPRESS6 to edit zip \nPRESS7 to edit PhoneNumber \nPRESS8 to edit Email");
                int choiceEdit = sc.nextInt();

                switch (choiceEdit) {
                    case 1:
                        System.out.println("Enter new FirstName : ");
                        addressbook.get(person).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter new Lastname : ");
                        addressbook.get(person).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address : ");
                        addressbook.get(person).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter new City : ");
                        addressbook.get(person).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter new State :  ");
                        addressbook.get(person).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter new ZIP : ");
                        addressbook.get(person).setZip(sc.next());
                        break;
                    case 7:
                        System.out.println("Enter new PhoneNumber : ");
                        addressbook.get(person).setPhoneNumber(sc.next());
                        break;
                    case 8:
                        System.out.println("Enter new Email : ");
                        addressbook.get(person).setEmail(sc.next());
                        break;
                    default:
                        System.out.println("Wrong choice!!!! Please try again later. ");
                        break;
                }
                System.out.println("Details of the contact after edited: ");
                System.out.println(addressbook.get(person));
            } else
                System.out.println("Sorry!!! There is no such contact present. Please check the firstname and try again.");
        }
    }

    /* Delete a contact*/
    static void deleteContact() {
        System.out.println("Enter the firstname of teh contact which you want to delete : ");
        String name = sc.next();
        for (int person = 0; person < addressbook.size(); person++) {
            if (addressbook.get(person).getFirstName().equals(name)) {
                addressbook.remove(person);
            } else {
                System.out.println("Contact NOT FOUND with '" + name + "'. Please check again and retry.");
            }
        }
    }

    public static void main(String[] args) {
        addContactDetails();

        boolean flag = true;
        while (flag) {
            System.out.println("\n*** Total Contacts present : " + addressbook.size() + " ***");
            System.out.println("\n\nPRESS 1 to Add Contact   ||   PRESS 2 to Edit Contact   ||   PRESS 3 to DELETE Contact");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContactDetails();
                    break;
                case 2:
                    editContactDetails();
                    break;
                case 3:
                    deleteContact();
                    break;
                default:
                    System.out.println("Invalid Input!!!! Please try again.");
                    break;
            }
        }
    }
}