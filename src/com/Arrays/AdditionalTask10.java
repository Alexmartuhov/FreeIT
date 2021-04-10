package com.Arrays;

import java.util.Random;

//Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
public class AdditionalTask10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass = new int[20];
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
            System.out.print(mass[i] + " ");
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        for (int i=0; i < mass.length;i++){
            if(mass[i]==max){
                mass[i]=mass[0];
                mass[0]=max;
            }
        }
        System.out.println();
        for (int i=0; i < mass.length;i++){
            System.out.print(mass[i] + " ");
        }
    }
}
