package com.peter.test;

public class ArrayTest {
    public static void main(String[] args) {
        int[] sp = new int[20];

        for (int i = 0; i < sp.length; i++) {
            if (i < 5) {
                sp[i] = i + 2;
            }

            if (i > 12) {
                sp[i] = i * 5;
            }

            sp[i] = i;
        }
        for (int i = 0; i < sp.length; i++) {
            System.out.println(sp[i]);

        }
    }
}
