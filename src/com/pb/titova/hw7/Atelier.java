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