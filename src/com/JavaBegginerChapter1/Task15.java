package com.JavaBegginerChapter1;


import java.util.Random;

//Создать массив, заполнить его случайными элементами, распечатать,
//        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).
public class Task15 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[10];
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt(100);
            System.out.print(i[j] + " ");
        }
        System.out.println();
        for (int j = i.length-1; j >= 0; j--) {
            System.out.print(i[j] + " ");
        }
    }
}

