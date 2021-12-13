package com.pb.titova.hw11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.time.LocalDate;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[]args) throws Exception{


        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);


        Scanner sc= new Scanner(System.in);
        int i=0;
        PhoneBook objmain = new PhoneBook();
        while (i==0) {
            System.out.println("Menu\n1.Add Contact\n2.Display all contacts sorted by Phone/Last name\n3.Search contact by phone\n4.Remove contact" +
                    "\n5.Redact contact by phone\n6.Exit\n7.Save\n8.Load");
            System.out.println("Enter your choice:");
            int n = Integer.parseInt(sc.nextLine());
            if (n == 1) {
                Contact obj = new Contact();
                System.out.println("Add a contact:");
                System.out.println("Enter the First name:");
                obj.setFirstName(sc.nextLine());
                System.out.println("Enter the Last name:");
                obj.setLastName(sc.nextLine());

                System.out.println("Enter the date of birth(dd/MM/yyyy):");
                obj.setDateOfBirth();

                System.out.println("Enter the Phone No.:");
                obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
                System.out.println("Enter the address:");
                obj.setAddress(sc.nextLine());
                obj.setDateOfRed();
                objmain.addContact(obj);
            }
            if (n == 2) {
                System.out.println("Do your want to search by phone number(1) or last name(2):");
                int l = Integer.parseInt(sc.nextLine());
                if (l == 1) {
                    List<Contact> obj = objmain.viewAllContact();
                    List<Long> srt = new ArrayList<Long>();
                    l = 0;
                    for (Contact temp : obj) {
                        srt.add(obj.get(l).getPhoneNumber());
                        ++l;
                    }
                    Collections.sort(srt);
                    System.out.println("The contacts in the list are:\n");
                    for (long temp : srt) {
                        Contact obj1 = objmain.viewContactGivenPhone(temp);
                        System.out.println("The contact is: ");
                        System.out.println("First name: " + obj1.getFirstName());
                        System.out.println("Last name: " + obj1.getLastName());
                        System.out.println("Date of birth: " + obj1.getDateOfBirth());
                        System.out.println("Phone No.: " + obj1.getPhoneNumber());
                        System.out.println("Address: " + obj1.getAddress());
                        System.out.println("Date Of modification: " + obj1.getDateOfRed() + "\n");
                    }
                } else if (l == 2) {
                    List<Contact> obj = objmain.viewAllContact();
                    List<String> srt = new ArrayList<String>();
                    l = 0;
                    for (Contact temp : obj) {
                        srt.add(obj.get(l).getLastName());
                        ++l;
                    }
                    Collections.sort(srt);

                    System.out.println("The contacts in the list are:\n");
                    for (String temp : srt) {
                        Contact obj1 = objmain.viewContactGivenLName(temp);
                        System.out.println("The contact is: ");
                        System.out.println("First name: " + obj1.getFirstName());
                        System.out.println("Last name: " + obj1.getLastName());
                        System.out.println("Date of birth: " + obj1.getDateOfBirth());
                        System.out.println("Phone No.: " + obj1.getPhoneNumber());
                        System.out.println("Address: " + obj1.getAddress());
                        System.out.println("Date Of modification: " + obj1.getDateOfRed() + "\n");
                    }
                }
            }
            if (n == 3) {
                System.out.println("Enter the Phone number to search contact:");
                Long n1 = Long.parseLong(sc.nextLine());
                Contact obj1 = objmain.viewContactGivenPhone(n1);
                System.out.println("The contact is: ");
                System.out.println("First name: " + obj1.getFirstName());
                System.out.println("Last name: " + obj1.getLastName());
                System.out.println("Date of birth: " + obj1.getDateOfBirth());
                System.out.println("Phone No.: " + obj1.getPhoneNumber());
                System.out.println("Address: " + obj1.getAddress());
                System.out.println("Date Of modification: " + obj1.getDateOfRed());
            }
            if (n == 4) {
                System.out.println("Enter the Phone number to remove:");
                Long n1 = Long.parseLong(sc.nextLine());
                System.out.println("Do you want to remove the contact (Y/N:");
                char ch = sc.nextLine().charAt(0);
                if (ch == 'Y') {
                    boolean f1 = objmain.removeContact(n1);
                    if (f1)
                        System.out.println("The contact is successfully deleted");
                    else
                        System.out.println("Contact is not found");
                }
                if (ch == 'N') {
                    System.out.println("ok");
                }
            }
            if (n == 5) {
                System.out.println("Enter the Phone number to search contact:");
                Long n1 = Long.parseLong(sc.nextLine());
                Contact obj1 = objmain.viewContactGivenPhone(n1);


                System.out.println("Change the contact:");
                System.out.println("Enter the First name:");
                obj1.setFirstName(sc.nextLine());
                System.out.println("Enter the Last name:");
                obj1.setLastName(sc.nextLine());

                System.out.println("Enter the date of birth(dd/MM/yyyy):");
                obj1.setDateOfBirth();

                System.out.println("Enter the Phone No.:");
                obj1.setPhoneNumber(Long.parseLong(sc.nextLine()));
                System.out.println("Enter the address:");
                obj1.setAddress(sc.nextLine());
                obj1.setDateOfRed();

            }
            if (n == 6) {
                System.exit(0);
            }
            if (n == 7) {
                List<Contact> svob = objmain.viewAllContact();
                mapper.writeValue(new File("contacts.json"), svob);


            }
            if (n == 8) {

                List<Contact> contacts = mapper.readValue( new File("contacts.json"), new TypeReference<List<Contact>>() {
                });
                for (Contact temp : contacts) {
                    objmain.addContact(temp);
                }
            }


        }
    }
}



