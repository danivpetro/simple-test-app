package com.peter.test;

public class ForLoopTest {
    public static void main(String[] args) {
        for (int i=0; i<10; i++ ) {
            int q=i;
           if (i>2){
               q=i*2;
           }

            System.out.println(q);
        }
     }
}
