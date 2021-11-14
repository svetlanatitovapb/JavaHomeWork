package com.pb.titova.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size size, String color) {
        super(size, color);
    }

    public Skirt(Size size, String color, double cost) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size = " + getSize() +
                ", cost = " + getCost() + " UAH" +
                ", colour = " + getColor() +
                "}";
    }
}
