package com.peter.test;

import javax.swing.*;

public class Application {

    private static int read(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public static void main(String[] args) {
        int bmwHp = read("Enter BMW HP: ");

        Car bmw = new Bmw5(bmwHp);
        Car vaz = new Vaz2102(read("Enter Vaz doors: "), read("Enter Vaz HP: "));

        printInfo(bmw);
        printInfo(vaz);
    }

    private static void printInfo(Car carToPrint) {
        JOptionPane.showMessageDialog(
                null, "ClassName: " + carToPrint.getClass().getSimpleName() + "\n" +
                        "Doors: " + carToPrint.doors() + "\n" +
                        "Horse power: " + carToPrint.horsePower());
    }
}
