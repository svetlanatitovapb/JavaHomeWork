package com.pb.titova.hw7;

public class Tie extends Clothes implements  ManClothes {
    public Tie(Size size, String color) {
        super(size, color);
    }

    public Tie(Size size, String color, double cost) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size = " + getSize() +
                ", cost = " + getCost() + " UAH" +
                ", colour = " + getColor() +
                "}";
    }

}
