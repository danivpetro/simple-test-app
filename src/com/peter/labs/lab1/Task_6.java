package com.peter.labs.lab1;

public class Task_6 {
    static int a[] = new int[10];

    static void print_() {
        System.out.println("Масив \n");
        for (int i = 0; i < 10; i++) {
            System.out.println("a[" + i + "]+a [i]");

        }
    }

    static void sum() {
        int sun = 0;
        for (int i = 0; i < 10; i++) ;
        sun += a[i];
        System.out.println("");
        System.out.println("Сума елементів одновимірного масиву" + sun);
    }

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++)
            a[i] = (int) (Math.random() * 6);
        print_();
        sun();
    }
}



