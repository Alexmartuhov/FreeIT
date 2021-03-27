package com.lesson2;
//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число:");
        int a = sc.nextInt();
        System.out.print("Второе число:");
        int b = sc.nextInt();
        System.out.print("Третье число:");
        int c = sc.nextInt();
        int x=0;
        if (a>0)
            x++;
        if (b>0)
            x++;
        if (c>0)
            x++;
        System.out.print("В исходном наборе "+x+" положительных чисел");
    }
}
