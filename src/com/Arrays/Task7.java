package com.Arrays;

import java.util.Random;

//Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//какой элемент является в этом массиве максимальным и сообщите индекс его
//последнего вхождения в массив.

public class Task7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[12];
        int max=0;
        int maxNumber=0;
        for (int j = 0; j < mass.length; j++) {
            mass[j] = r.nextInt(16);
            if (mass[j]>=max){
                max=mass[j];
                maxNumber=j;
            }
        }
        System.out.println("Максимальный элемент: "+max);
        System.out.println("Индекс последнего вхождения максимального элемента в массив: "+maxNumber);
    }
}
