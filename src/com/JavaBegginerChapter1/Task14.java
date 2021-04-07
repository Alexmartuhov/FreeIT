package com.JavaBegginerChapter1;


import java.util.Random;

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.
public class Task14 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[10];
        int max=0, min=10;
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt(9)+1;
            if (i[j] > max) {
                max = i[j];
            }
            if (i[j] < min) {
                min = i[j];
            }
            System.out.print(i[j]+" ");
        }
        System.out.println();
        System.out.print("Максимальная оценка: "+max+".");
        System.out.print(" Её номер(номера): ");
        for (int j = 0; j < i.length; j++) {
            if (i[j]==max){
                System.out.print(j+1+" ");
            }
        }
        System.out.print("\nМинимальная оценка: "+min+".");
        System.out.print(" Её номер(номера): ");
        for (int j = 0; j < i.length; j++) {
            if (i[j]==min){
                System.out.print(j+1+" ");
            }
        }
    }
}
