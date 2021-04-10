package com.Arrays;

//Найти наименьший нечетный элемент.

import java.util.Random;

public class AdditionalTask4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[20];
        int j=0; //счетчик
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
            if(mass[i]!=0&&mass[i]%2!=0){
                j++;
                if (mass[i]<min){
                    min=mass[i];
                }
            }
        }
        System.out.println();
        if (j != 0) {
            System.out.println("Наименьшее нечетное значение: " + min);
        } else {
            System.out.println("Нет нечетных элементов");
        }
    }
}
