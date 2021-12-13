package com.pb.titova.hw11;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();



    public void addContact(Contact contactObj) {
        phoneBook.add(contactObj);
    }

    public List<Contact> viewAllContact() {

        return phoneBook;
    }

    public Contact viewContactGivenPhone(Long phoneNumber) {
        Contact obj = new Contact();
        for (Contact obj1 : phoneBook) {
            if (obj1.getPhoneNumber() == phoneNumber) {
                obj = obj1;
            }
        }
        return obj;
    }

    public Contact viewContactGivenLName(String LName) {
        Contact obj = new Contact();
        for (Contact obj1 : phoneBook) {
            if (obj1.getLastName() == LName) {
                obj = obj1;
            }
        }
        return obj;
    }

    public boolean removeContact(long phoneNumber) {
        boolean f = false;
        for (Contact obj : phoneBook) {
            if (obj.getPhoneNumber() == phoneNumber) {
                f = true;
                phoneBook.remove(obj);
                break;
            }
        }
        return f;
    }


}
