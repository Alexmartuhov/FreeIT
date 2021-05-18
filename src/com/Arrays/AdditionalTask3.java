package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Найти средне арифметическое элементов массива, превосходящих некоторое
//число С.
public class AdditionalTask3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число С: ");
        int с=sc.nextInt();
        int[] mass = new int[5];
        int sum = 0;
        double average;
        int j = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
            if(mass[i]>с){
                sum+=mass[i];
                j++;
            }
        }
        if (j != 0) {
            average = (double) sum / j;
            System.out.println();
            System.out.println("Среднне арифметическое элементов массива превосходящих "+с+": " + average);
        } else {
            System.out.println("Нет элементов массива превосходящих число С");
        }
    }
}
