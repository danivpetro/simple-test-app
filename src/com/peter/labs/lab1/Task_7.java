package com.peter.labs.lab1;

public class Task_7 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int i, j, z = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                array[i][j] = z;
                z++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
