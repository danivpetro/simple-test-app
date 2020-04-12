package com.peter.labs.lab2;

public class Task_4 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Відлік часу");
        while (n >= 10) {
            if (n == 0)
                System.out.println("The end");
            else
                System.out.println("Тік" + n);
            n--;
        }
    }
}
