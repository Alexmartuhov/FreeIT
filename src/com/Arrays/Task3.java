package com.Arrays;

import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//        это количество на экран на отдельной строке.
public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[15];
        int even = 0;
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt(99);
            System.out.print(i[j] + " ");
            if (i[j] != 0 && i[j] % 2 == 0) {
                even++;
            }
        }
        System.out.println();
        System.out.println("В массиве четных чисел: "+even);
    }
}

