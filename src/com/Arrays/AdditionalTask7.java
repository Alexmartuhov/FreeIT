package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Подсчитать, сколько раз встречается элемент с заданным значением.
public class AdditionalTask7 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int с = sc.nextInt();
        int[] mass = new int[1000];
        int counter = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            if (mass[i] == с) {
                counter++;
            }
        }
        System.out.println("Элементов "+с+" в массиве: "+counter);
    }
}
