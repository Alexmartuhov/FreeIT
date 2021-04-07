package com.JavaBegginerChapter1;


import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел, сумму которых нужно узнать:");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 3; count < n; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.print("Сумма первых "+n+" чисел, которые делятся на три: "+sum);
    }
}

