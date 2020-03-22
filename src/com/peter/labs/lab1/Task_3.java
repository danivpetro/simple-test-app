package com.peter.labs.lab1;

public class Task_3 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 12;
        b = 15;
        c = 10;
        d = 20;
        if (a < b) {
            System.out.println("Значення змінної, яке рівне " + a +
                    " менше значення змінної, що рівне " + b);
        } else {
            System.out.println(" Умова не виконується ");
        }
        if (c == b) {
            System.out.println(" число " + a + " дорівнює " + d);
        } else {
            System.out.println(" числа " + c + " та " + d + " не рівні між собою ");
        }
    }
}
