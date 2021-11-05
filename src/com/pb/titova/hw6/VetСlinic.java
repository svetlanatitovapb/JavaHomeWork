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


        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
