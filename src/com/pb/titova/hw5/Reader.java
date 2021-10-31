package com.pb.titova.hw5;

public class Reader {
    private String fullname;
    private int libcartnumber;
    private String faculty;
    private String dateofbirth;
    private String phone;

    public Reader(String fullname, int libcartnumber, String faculty, String dateofbirth, String phone){
        this.fullname = fullname;
        this.libcartnumber = libcartnumber;
        this.faculty = faculty;
        this.dateofbirth = dateofbirth;
        this.phone = phone;
    }
    public Reader() {
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getLibcartnumber() {
        return libcartnumber;
    }

    public void setLibcartnumber(int libcartnumber) {
        this.libcartnumber = libcartnumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void takeBook1(int number) {
        System.out.println(this.fullname + " взял " + number + " книги.");
    }

    public void takeBook2(String... books) {
        System.out.println(this.fullname + " взял книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook3(Book... books) {
        System.out.println(this.fullname + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getName()  +"("+ book.getAuthor() + book.getYearpub()+")");
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fullname + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fullname + " вернул книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fullname + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getName() + book.getAuthor() + book.getYearpub());
        }
        System.out.println();
    }


    String getInfo() {
        return "ФИО: " + fullname + ", номер читательского билета: " + libcartnumber +
                ", факультет: " + faculty + " ,дата рождения: " + dateofbirth + " ,телефон: " + phone + "";
    }


}



