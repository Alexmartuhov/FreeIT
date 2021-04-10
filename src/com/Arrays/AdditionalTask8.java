package com.Arrays;

import java.util.Random;

//Найти второй по величине (т.е. следующий по величине за максимальным)
//элемент в массиве.
public class AdditionalTask8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[20];
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                mass[i] = 0;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max2) {
                max2 = mass[i];
            }
        }
        System.out.println("\nВторой по величине элемент массива: " + max2);
    }
}

//        Решение через сортировку пузырьком:
//        Random r = new Random();
//        int[] mass = new int[20];
//        int j = 0; //счетчик
//        int max = 0;
//        int max2 = 0;
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = r.nextInt(100);
//            System.out.print(mass[i] + " ");
//        {
//        System.out.println();
//        for (int start=0; start<mass.length-1;start++)
//            for (int index=0;index<mass.length-1-start;index++){
//                if (mass[index] > mass[index+1]) {
//                    int tmp=mass[index];
//                    mass[index]=mass[index+1];
//                    mass[index+1]=tmp;
//                }
//            }
//        for(int i=0;i<mass.length;i++){
//            System.out.print(mass[i]+" ");
//        }
//        System.out.println("\nВторой по величине элемент массива: " + mass[mass.length-2]);
//    }
//}
