package com.matury.phonbook.services;

import com.matury.phonbook.model.BusinessCounter;
import com.matury.phonbook.model.Contact;
import com.matury.phonbook.model.PersonalContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhonBook {
    public ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void run() {


        int select;
        boolean loop = true;


        do {
            menu();
            System.out.println("--------------");
            System.out.print("Enter One Number From Menu :");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    addContact();
                    break;
                case 2:
                    System.out.print("Enter Id For Delete Account :");
                    int id = scanner.nextInt();
                    deletContact(id);
                    break;
                case 3:
                    showContact();
                    break;
                case 4:
                    loop = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("enter valid number");
            }

        }
        while (loop);

    }


    public void menu() {
        System.out.println("--------menu--------");
        System.out.println("1: Add Contact");
        System.out.println("2: Delete Contact");
        System.out.println("3: Show Contact");
        System.out.println("4: Exit");
    }

    public void addContact() {
        System.out.println("----Contact Type----");
        System.out.println("1:personal contact");
        System.out.println("2:business contact");
        System.out.print("Insert Contact Type:");
        int select = scanner.nextInt();

        if (select == 1) {
            System.out.print("Enter Name:");
            String name = scanner.next();
            System.out.print("Enter family:");
            String family = scanner.next();
            System.out.print("Enter Number:");
            String number = scanner.next();
            PersonalContact personalContact = new PersonalContact(name, number);
            personalContact.setFamily(family);
            contacts.add(personalContact);

        } else {
            System.out.print("Enter Name:");
            String name = scanner.next();
            System.out.print("Enter Number:");
            String number = scanner.next();
            System.out.print("Enter FaxNumber:");
            String fax = scanner.next();
            BusinessCounter busunesContact = new BusinessCounter(name, number);
            busunesContact.setFax(fax);
            contacts.add(busunesContact);

        }


    }

    public void showContact() {
      for (Contact contact:contacts) {
          System.out.println("id:" +contact.getId()+ " /name: " + contact.getName() + "---number:" + contact.getNumber());
      }
    }

    public void deletContact(int id) {
        Contact contactToDelete = null;
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                //contactToDelete = contact;
                contacts.remove(contact);
                break;
            }
        }

        if (contactToDelete != null) {
            contacts.remove(contactToDelete);
            System.out.println("Account Deleted Successfully");
        }
        else {
            System.out.println("Not Found Account");
        }
    }




}
