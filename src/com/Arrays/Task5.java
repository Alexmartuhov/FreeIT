package com.Arrays;

import java.util.Random;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//        арифметическое элементов каждого массива и сообщите, для какого из
//        массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).
public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        int sum1 = 0, sum2 = 0;
        double average1, average2;
        for (int j = 0; j < mass1.length; j++) {
            mass1[j] = r.nextInt(15);
            mass2[j] = r.nextInt(15);
            System.out.print(mass1[j] + " ");
            sum1 += mass1[j];
            sum2 += mass2[j];
        }
        System.out.println();
        for (int j = 0; j < mass2.length; j++) {
            System.out.print(mass2[j] + " ");
        }
        System.out.println();
        average1 = sum1 / mass1.length;
        average2 = sum2 / mass2.length;
        if (average1 < average2) {
            System.out.println("Среднее арифмитическое второго массива больше");
        } else {
            if (average1 > average2) {
                System.out.println("Среднее арифмитическое первого массива больше");
            } else {
                System.out.println("Средние арифмитические массивов равны");
            }
        }
    }
}

