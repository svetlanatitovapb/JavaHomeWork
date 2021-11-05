package com.pb.titova.hw6;

public class Dog extends Animal{

    private String nikname;

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getNikname() {
        return nikname;
    }

    public void setName(String name) {
        this.nikname = name;
    }

    public void makeNoise(){
        System.out.println("гав -гав ");
    }

    public void eat(){
        System.out.println("Собака ест");
    }
    public String toString() {
        return "Собака (" +
                " еда -'" + getFood() + '\'' +
                ", локация -'" + getLocation() + '\'' +
                ')';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return nikname!= null ? nikname.equals(dog.nikname) : dog.nikname == null;
    }
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nikname != null ? nikname.hashCode() : 0);
        return result;
    }
}
