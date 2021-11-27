package com.pb.titova.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> numBox1 = new NumBox<>(99);
        NumBox<Integer> numBox2 = new NumBox<>(22);

        try {
            numBox1.add(41F);
            numBox1.add(15F);
            numBox1.add(4F);
            numBox1.add(33F);
            numBox1.add(19F);

            numBox2.add(11);
            numBox2.add(7);
            numBox2.add(1);
            numBox2.add(4);
        } catch (tooManyElements e) {
            e.printStackTrace();
        }

        show(numBox1);
        show(numBox2);
    }
    public static void show(NumBox<?> box){
        System.out.println(box);
        System.out.println("Сумма: "+box.sum());
        System.out.println("Размер "+box.length());
        System.out.println("Среднее значение " +box.average());
        int index = (int) (Math.random()*box.length());
        System.out.println("Значение елемента "+(index+1)+" равно "+box.get(index));
        System.out.println("Максимум "+box.max()+"\n");
    }

}


