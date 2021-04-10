package com.Arrays;

import java.util.Random;
//public static void main(String[] args) {
//        Random r = new Random();
//        int[] mass = new int[15];
//        for (int i = 0; i < mass.length; i++) {
//        mass[i] = r.nextInt(100);
//        System.out.print(mass[i] + " ");
//
//        }
//        System.out.println();
//        }

// Найти произведение элементов, кратных 3.

public class AdditionalTask1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[10];
        int product = 1;
        int number = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
            if (mass[i] != 0 && mass[i] % 3 == 0) {
                product *= mass[i];
                number++;
            }
        }
        System.out.println();
        if (number == 0) {
            System.out.println("В массиве нет элементов кратных трем");
        } else {
            System.out.println("Произведение элементов массива кратных трем: " + product);
        }
    }
}
