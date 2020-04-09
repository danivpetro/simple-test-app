package com.peter.labs.lab2;

public class Task_2 {
    public static void main(String[] args) {
        int mouth = 2;
        String pora_roky;
        if (mouth == 12 || mouth == 1 || mouth == 2)
            pora_roky = "Зима";
        else if (mouth == 3 || mouth == 4 || mouth == 5)
            pora_roky = "Весна";
        else if (mouth == 6 || mouth == 7 || mouth == 8)
            pora_roky = "Літо";
        else if (mouth == 9 || mouth == 10 || mouth == 11)
            pora_roky = "Осінь";
        else
            pora_roky = "Немає такого міяця в році";
        System.out.println("Лютий це пора-" + pora_roky);
    }
}
