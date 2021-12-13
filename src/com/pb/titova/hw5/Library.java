package com.pb.titova.hw5;

public class Library {
    public static void main(String[] args){
        Reader reader1 = new Reader();
        reader1.setFullname("Титов Ю.Я.");
        reader1.setLibcartnumber(10);
        reader1.setFaculty("FIT");
        reader1.setDateofbirth("08.04.2003");
        reader1.setPhone("+80980000000");
        Reader reader2 = new Reader();
        reader2.setFullname("Петров В.В.");
        reader2.setLibcartnumber(22);
        reader2.setFaculty("FIT");
        reader2.setDateofbirth("05.12.2002");
        reader2.setPhone("+80670000000");
        Reader reader3 = new Reader();
        reader3.setFullname("Соколов А.И.");
        reader3.setLibcartnumber(33);
        reader3.setFaculty("FIT");
        reader3.setDateofbirth("16.06.2003");
        reader3.setPhone("+80680000000");
        Reader[] readers = {reader1, reader2, reader3};


        Book book1 = new Book();
        book1.setName("Приключения ");
        book1.setAuthor("Иванов И. И.");
        book1.setYearpub(" 2000 г.");
        Book book2 = new Book();
        book2.setName("Словарь ");
        book2.setAuthor("Сидоров А. В.");
        book2.setYearpub(" 1980 г.");
        Book book3 = new Book();
        book3.setName("Энциклопедия ");
        book3.setAuthor("Гусев К. В");
        book3.setYearpub(" 2010 г.");
        Book[] books = {book1, book2, book3};

        reader2.takeBook1( 3);
        reader2.takeBook2("Приключения, Словарь, Энциклопедия");
        reader2.takeBook3(book1, book2, book3);

        reader2.returnBook1( 3);
        reader2.returnBook2("Приключения, Словарь, Энциклопедия");
        reader2.returnBook3(book1, book2, book3);

        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }


        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }

    }


}


// Создать пакет hw5, в нем создать 3 класса:
//Book, Reader, Library.
//
//Класс Book хранит такую информацию о книге:
//- название
//- автор книги
//- год издания
//
//Класс Reader хранит такую информацию о пользователе библиотеки:
//- ФИО
//- номер читательского билета
//- факультет
//- дата рождения
//- телефон
//Типы полей выбирать на свое усмотрение.
//
//Имеет перегруженные методы takeBook(), returnBook():
//
//- takeBook, который будет принимать количество взятых книг.
//Выводит на консоль сообщение
//"Петров В. В. взял 3 книги".
//
//
//- takeBook, который будет принимать переменное количество названий книг.
//Выводит на консоль сообщение
//"Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//
//- takeBook, который будет принимать переменное количество объектов класса Book.
//Выводит на консоль сообщение
//"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//
//Аналогичным образом перегрузить метод returnBook().
//Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
//- "Петров В. В. вернул 3 книги"
//- "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//- "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//
//Класс Library используется как демонстрация работы классов Book и Reader.
//Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
//Выполняются такие действия:
//- печатаются все книги.
//- печатаются все читатели.
//- демонстрируется работа всех вариантов методов takeBook() и returnBook().


// mentor's remark

// На будущее методы takeBook() и returnBook() должны иметь именно такое название и быть перегруженными.
//Т.е. в итоге должно быть:
//public void takeBook(int number) {
////your code
//}
//
//public void takeBook(String... books) {
//        //your code
//    }