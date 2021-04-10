package com.Arrays;

import java.util.Random;

//Проверить, различны ли все элементы массива.

public class AdditionalTask6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        boolean different = true;
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    different = false;
                    break;
                }
            }
            if (!different) break;
        }
        if (different) {
            System.out.println("Все элементы массива различны");
        } else {
            System.out.println("В массиве есть одинаковые элементы");
        }
    }
}
