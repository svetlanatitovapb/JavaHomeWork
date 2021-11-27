package com.pb.titova.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.XS, "white", 90),
                new Tshirt(Size.L, "black", 120),
                new Pants(Size.M, "blue", 500),
                new Pants(Size.XXS, "black", 700),
                new Skirt(Size.S, "pink", 350),
                new Skirt(Size.M, "red", 750),
                new Tie(Size.L, "dark blue", 160),
                new Tie(Size.L, "green", 700),
        };
        Atelier studio = new Atelier();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
    }
    public void dressMale(Clothes[] clothes) {
        System.out.println("Men's clothing (in stock):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Women's clothing (in stock):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }



}

// Создать интерфейсы
//- ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
//- WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
//Эти методы не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
//
//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.
//
//
//Создать класс Atelier с методом main, и еще двумя статическими методами:
//dressMan(Clothes[] clothes)
//dressWomen(Clothes[] clothes)
//на вход которых будет поступать массив, содержащий все типы одежды.
//В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
//Метод dressWomen выводит на консоль всю информацию о женской одежде.
//Метод dressMan выводит на консоль всю информацию о мужской одежде.
//В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женская.