package com.Arrays;

import java.util.Random;

//Найти среднее арифметическое элементов с нечетными номерами

public class AdditionalTask2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
        }
        int sum = 0;
        double average;
        int j = 0;
        for (int i = 1; i < mass.length; i += 2) {
            sum += mass[i];
            j++;
        }
        if(j!=0) {
            average = (double)sum / j;
            System.out.println();
            System.out.println("Среднне арифметическое элементов с нечетными номерами: " + average);
        }else{
            System.out.println("Слишком мало элементов в массиве");
        }
    }
}
