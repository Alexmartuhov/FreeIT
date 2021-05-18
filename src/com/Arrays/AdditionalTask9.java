package com.Arrays;

import java.util.Random;

//Найти наименьший элемент среди элементов с четными индексами массива
public class AdditionalTask9 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[10];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
        }
        for (int i = 0; i < mass.length; i += 2) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("\nНаименьший элемент массива с четным индексом: "+ min);
    }
}
