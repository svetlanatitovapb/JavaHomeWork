package com.pb.titova.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void makeNoise(){
        System.out.println(name + "...");
    }

    public void eat(){
        System.out.println(name + "ест" + food);
    }

    public void sleep() {
        System.out.println(name + "спит.");
    }

}
