package com.pb.titova.hw6;

public class Horse extends Animal{
    private double weight;

    public Horse(String food, String location) {
        super(food, location);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void makeNoise(){
        System.out.println("иго-го");
    }

    public void eat(){
        System.out.println("Лошадь ест");
    }
    public String toString() {
        return "Лошадь (" +
                " еда -'" + getFood() + '\'' +
                ", локация -'" + getLocation() + '\'' +
                ')';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Double.compare(horse.weight, weight) == 0;
    }
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
