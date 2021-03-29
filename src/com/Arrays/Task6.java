package com.Arrays;

import java.util.Random;

//Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.
public class Task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[4];
        for (int j = 0; j < mass.length; j++) {
            mass[j] = r.nextInt(10);
            System.out.print(mass[j] + " ");
        }
        int i = 0;
        int k = 0; //счетчик
        while (i < mass.length - 1) {
            if (mass[i] < mass[i + 1]) {
                k++;
            }
            i++;
        }
        System.out.println();
        if (k == 3) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}