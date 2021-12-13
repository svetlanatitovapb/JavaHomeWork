package com.pb.titova.hw11;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Contact {
    Scanner sc= new Scanner(System.in);
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private long phoneNumber;
    private String address;
    private String dateOfRed;


    public Contact(){}

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setDateOfBirth() {
        while(!sc.hasNext("([0-9]{2})/([0-9]{2})/([0-9]){4}")) {
            System.out.print("That's not a valid date. Enter the date again: ");
            sc.nextLine();
        }
        String dateAsString = sc.nextLine();
        String[] dateArr = dateAsString.split("/");

        int[] dateArrInt = Arrays.asList(dateArr)
                .stream()
                .mapToInt(Integer::parseInt)
                .toArray();
        this.dateOfBirth= LocalDate.of(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]), Integer.parseInt(dateArr[0]));
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Contact(String firstName, String lastName, LocalDate dateOfBirth, long phoneNumber, String address){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumber=phoneNumber;
        this.address =address;
    }
    public void setDateOfRed() {
        Date date = new Date();
        this.dateOfRed = date.toString();
    }
    public String getDateOfRed() {
        return dateOfRed;
    }
}
