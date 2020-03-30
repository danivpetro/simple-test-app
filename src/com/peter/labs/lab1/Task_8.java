package com.peter.labs.lab1;

public class Task_8 {
    public static void main(String[] args) {
        float f = 1 / 1000000f; //вказуємо f у ділянку,
        double d = 2 / 1000000;// щоб результат не перетворювався в ціле
        System.out.println(f);//вивід без форматування
        System.out.println(d);
        System.out.println("==========");
        System.out.format("%10.9f", f); // 10 знаків всього, 9 після коми
        System.out.print("");
        System.out.format("%10.9f", d);
        System.out.println("\n==========");
        System.out.format("%10.9f%n", f);// %n дозволяє побачити перевід ряка
        System.out.format("10.9f%n", d);// після значення
    }
}