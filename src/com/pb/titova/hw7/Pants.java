package com.pb.titova.hw7;

public class Pants extends Clothes implements  ManClothes, WomenClothes{
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size = " + getSize() +
                ", cost = " + getCost() + " UAH" +
                ", colour = " + getColor() +
                "}";
    }
}
