package com.pb.titova.hw6;

public class Cat extends Animal{

    private String color;


    public Cat(String food, String location) {
        super(food, location);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void makeNoise(){
        System.out.println("мяуу");
    }

    public void eat(){
        System.out.println("Кошка ест");
    }
    public String toString() {
        return "Кошка (" +
                " еда -'" + getFood() + '\'' +
                ", локация -'" + getLocation() + '\'' +
                ')';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return color != null ? color.equals(cat.color) : cat.color == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

}
