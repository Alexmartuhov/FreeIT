package com.Arrays;

import java.util.Random;

//Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//        массив на экран в строку. Замените каждый элемент с нечётным индексом на
//        ноль. Снова выведете массив на экран на отдельной строке.
public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[20];
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt(20);
            System.out.print(i[j] + " ");
            if (j % 2 != 0) {
                i[j] = 0;
            }
        }
        System.out.println();
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j] + " ");
        }
    }
}
