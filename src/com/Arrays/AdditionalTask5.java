package com.Arrays;

import java.util.Random;

//«Сожмите» массив, выбросив из него каждый второй элемент.
//«Освободившиеся» места массива заполните нулями.
public class AdditionalTask5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[15];
        int mass2Length = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
            if (i % 2 == 0) {
                mass2Length++;
            }
        }
        System.out.println();
        int[] mass2 = new int[mass2Length]; //Сжатый массив без каждого второго элемента
        int j = 0;
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = mass[j];
            j += 2;
            System.out.print(mass2[i] + " ");
        }
        System.out.println();
        int[] mass3 = mass; //массив, где свободные места заполнены нулями
        for (int i = 0; i < mass3.length; i++) {
            if (i % 2 == 1) {
                mass3[i] = 0;
            }
            System.out.print(mass3[i] + " ");
        }
    }
}
