package com.JavaBegginerChapter1;
//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.


import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[10];
        int max = 0;
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt();
            if (i[j] > max) {
                max = i[j];
            }
            System.out.print(i[j]+" ");
        }
        System.out.println();
        System.out.print("Максимальное число: "+max);
    }
}

