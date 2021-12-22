package com.pb.titova.hw13;

import java.util.LinkedList;
import java.util.Queue;

public class ConsumerManufacturer {
    public static class Consumer implements Runnable {
        private final Queue<Integer> dataBuffer;
        private int size;
        public Consumer(Queue<Integer> dataBuffer, int size) {
            this.dataBuffer = dataBuffer;
            this.size = size;
        }
        private int consumer() throws InterruptedException{
            int num;
            synchronized (dataBuffer){
                if (dataBuffer.isEmpty()){
                    dataBuffer.wait();
                }
                num = dataBuffer.poll();
                dataBuffer.notifyAll();
                return num;
            }
        }
        @Override
        public void run() {
            while (true){
                try{
                    System.out.println("The consumer stuck a digit from the data buffer: " + consumer());
                }catch (InterruptedException e){
                    System.out.println("Consumer thread error");
                }
            }
        }
    }
    public static class Manufacturer implements Runnable {

        private final Queue <Integer> dataBuffer;
        private int size;
        public Manufacturer(Queue<Integer> dataBuffer, int size){
            this.dataBuffer = dataBuffer;
            this.size = size;
        }
        private int manufacturer() throws InterruptedException{
            int randNum;
            synchronized (dataBuffer){
                if (dataBuffer.size()==size){
                    dataBuffer.wait();
                }
                randNum=(int) (Math.random()*100);
                dataBuffer.add(randNum);
                dataBuffer.notifyAll();
                return randNum;
            }
        }
        @Override
        public void run() {
            while (true){
                try{
                    System.out.println("The manufacturer has placed a number in the data buffer: " + manufacturer());
                }catch (InterruptedException e){
                    System.out.println("Producer thread error");
                }
            }
        }
    }
    public static void main(String[] args){
        LinkedList<Integer> dataBuffer = new LinkedList<>();
        int size=5;
        Thread manufacturer = new Thread(new Manufacturer(dataBuffer,size),"Manufacturer");
        Thread consumer = new Thread(new Consumer(dataBuffer,size),"Consumer");
        manufacturer.start();
        consumer.start();
    }
}



//Написать программу решающую классическую задачу производитель и потребитель.
//Дано два потока — производитель и потребитель.
//Два потока разделяют общий буфер данных, размер которого ограничен, например не больше 5 элементов.
//Производитель генерирует некоторые данные (можно выбрать любые, числа, символы, строки) и помещает их в буфер.
//Потребитель «потребляет» их из буфера - выводит на печать в консоль и очищает буфер.
//Если буфер пуст, потребитель должен ждать, пока там появятся данные.
//Если буфер заполнен полностью, производитель должен ждать, пока потребитель заберёт данные и место освободится.
//В качестве буфера можно выбрать, например Queue или List, но реализация не должна быть потокобезопасная (например LinkedList).