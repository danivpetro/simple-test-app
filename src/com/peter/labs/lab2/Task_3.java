package com.peter.labs.lab2;

public class Task_3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Відлік часу");
        while (n >= 0) {
            if (n == 0)
                System.out.println("The End");
            else
                System.out.println("тік" + n);
            n--;
        }
    }
}
