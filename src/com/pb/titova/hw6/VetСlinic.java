package com.pb.titova.hw6;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];;
        animals[0] = new Dog("кости", "дом");
        animals[1] = new Cat("молоко", "квартира");
        animals[2] = new Horse("сено", "ферма");

        Veterinarian vt = new Veterinarian();
        Class clazz = vt.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));
        Class vtClazz = Class.forName("com.pb.titova.hw6.Veterinarian");

        for (int i =0; i<animals.length; i++) {
            vt.treatAnimal(animals[i]);
        }

    }
}

// В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
//Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//Метод sleep, например, может выводить на консоль "Такое-то животное спит".
//Dog, Cat, Horse переопределяют методы makeNoise, eat.
//Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
//В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
//Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
//Пусть этот метод печатает на экран food и location пришедшего на прием животного.
//Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//В цикле отправляйте животных на прием к ветеринару.
//Объект класса Veterinarian создайте с помощью рефлексии.