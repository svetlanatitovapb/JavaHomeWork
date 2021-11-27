package com.pb.titova.hw10;

import java.util.ArrayList;
import java.util.List;

public class NumBox<T extends java.lang.Number> {

    private final List<T> numbers;
    int size = 0;


    public NumBox (int size){
        numbers = new ArrayList<>();
        this.size = size;
    }
    public T get(int index) {
        return numbers.get(index);
    }
    //public  void set(int index, T number) {
    //     this.numbers[index] = number;
    // }
    void add(T num)
            throws tooManyElements {
        if (numbers.size() < size) {
            numbers.add(num);
        } else throw new tooManyElements();
    }
    int length(){
        return numbers.size();
    }
    double average(){
        double summ = 0.0;
        for (T i:numbers){
            summ += i.doubleValue();
        }
        return summ/numbers.size();
    }
    double sum(){
        double summ = 0.0;
        for (T i:numbers){
        summ += i.doubleValue();
    }
        return summ;
}
    T max() {
        T max = numbers.get(0);
        for (int i=0; i< numbers.size(); i++){
            if (numbers.get(i).doubleValue()>max.doubleValue()){
                max= numbers.get(i);
            }
        }
        return max;
    }
}

