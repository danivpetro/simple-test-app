package com.peter.labs.lab2;

import java.io.IOException;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        char menu;
        do {
            System.out.println("Довідка:");
            System.out.println("1. -оператор if");
            System.out.println("2. -оператор switch");
            System.out.println("3. -оператор  while");
            System.out.println("4. -оператор do-while");
            System.out.println("5. -оператор for");
            System.out.println("Виберіть пункт меню...");
            menu = (char) System.in.read();
        } while (menu < '1' || menu > '5');
        System.out.println("\n");
        switch (menu) {
            case '1':
                System.out.println();
                System.out.println("умовний оператор if:\n");
                System.out.println(" if(умова)вираз 1;");
                System.out.println(" else вираз 2; ");
                break;
            case '2':
                System.out.println("оператор виробу switch:\n");
                System.out.println("switch( expression) }");
                System.out.println("case value:");
                System.out.println("послідовність оператів");
                System.out.println("break;");
                System.out.println("//-//-");
                System.out.println("}");
                break;


        }
    }

}
