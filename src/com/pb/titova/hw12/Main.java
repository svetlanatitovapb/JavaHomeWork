package com.pb.titova.hw12;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;


import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

@FunctionalInterface
interface Operation {
    Contact execute(Contact x);
}
interface Operation1 {
    List<Contact> execute();
}
interface Operation2 {
    Contact execute(Long x);
}
interface Operation3 {
    Contact execute(String x);
}
interface Operation4 {
    boolean execute(Long x);
}
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


        Operation Output = (x) -> {
            System.out.println("The contact is: ");
            System.out.println("First name: " + x.getFirstName());
            System.out.println("Last name: " + x.getLastName());
            System.out.println("Date of birth: " + x.getDateOfBirth());
            System.out.println("Phone No.: " + x.getPhoneNumber());
            System.out.println("Address: " + x.getAddress());
            System.out.println("Date Of modification: " + x.getDateOfRed() + "\n");
            return null;
        };

        List<Contact> phoneBook = new ArrayList<>();

        Operation addContact = (x) -> {
            phoneBook.add(x);
            return null;
        };

        Operation1 viewAllContacts = () -> {
            return phoneBook;
        };

        Operation2 viewContactGivenPhone = (x) -> {
            Contact obj = new Contact();
            for (Contact obj1 : phoneBook) {
                if (obj1.getPhoneNumber() == x) {
                    obj = obj1;
                }
            }
            return obj;
        };

        Operation3 viewContactGivenLName = (x) -> {
            Contact obj = new Contact();
            for (Contact obj1 : phoneBook) {
                if (obj1.getLastName() == x) {
                    obj = obj1;
                }
            }
            return obj;
        };

        Operation4 removeContact = (x) -> {
            boolean f = false;
            for (Contact obj : phoneBook) {
                if (obj.getPhoneNumber() == x) {
                    f = true;
                    phoneBook.remove(obj);
                    break;
                }
            }
            return f;
        };

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
                addContact.execute(obj);
            }
            if (n == 2) {
                System.out.println("Do your want to sort by phone number(1) or last name(2):");
                int l = Integer.parseInt(sc.nextLine());
                if (l == 1) {
                    List<Contact> obj = viewAllContacts.execute();
                    List<Long> srt = new ArrayList<>();

                    obj.forEach(x->srt.add(x.getPhoneNumber()));
                    Collections.sort(srt);
                    System.out.println("The contacts in the list are:\n");
                    srt.stream().map(viewContactGivenPhone::execute)
                            .forEach(x->Output.execute(x));

                } else if (l == 2) {
                    List<Contact> obj = viewAllContacts.execute();
                    List<String> srt = new ArrayList<>();

                    obj.forEach(x->srt.add(x.getLastName()));
                    Collections.sort(srt);

                    System.out.println("The contacts in the list are:\n");
                    srt.stream().map(viewContactGivenLName::execute)
                            .forEach(x->Output.execute(x));
                }
            }
            if (n == 3) {
                System.out.println("Enter the Phone number to search contact:");
                Long n1 = Long.parseLong(sc.nextLine());
                Stream.of(n1).map(viewContactGivenPhone::execute)
                        .forEach(x->Output.execute(x));
            }
            if (n == 4) {
                System.out.println("Enter the Phone number to remove:");
                Long n1 = Long.parseLong(sc.nextLine());
                System.out.println("Do you want to remove the contact (Y/N):");
                char ch = sc.nextLine().charAt(0);
                if (ch == 'Y') {
                    boolean f1 = removeContact.execute(n1);
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
                Contact obj1 = viewContactGivenPhone.execute(n1);


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
                List<Contact> svob = viewAllContacts.execute();
                mapper.writeValue(new File("contacts.json"), svob);


            }
            if (n == 8) {

                List<Contact> contacts = mapper.readValue( new File("contacts.json"), new TypeReference<List<Contact>>() {
                });
                contacts.forEach(addContact::execute);


            }


        }
    }
}



