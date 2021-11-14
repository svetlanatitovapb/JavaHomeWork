package com.pb.titova.hw7;

public class Tshirt extends Clothes implements  ManClothes, WomenClothes{
    public Tshirt(Size size, String color) {
        super(size, color);
    }

    public Tshirt(Size size, String color, double cost) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size = " + getSize() +
                ", cost = " + getCost() + " UAH" +
                ", colour = " + getColor() +
                "}";
    }

}
