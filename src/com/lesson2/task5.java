package com.lesson2;

import java.util.Scanner;

//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число:");
        int a = sc.nextInt();
        System.out.print("Второе число:");
        int b = sc.nextInt();
        System.out.print("Третье число:");
        int c = sc.nextInt();
        int x = 0;
        int y = 0;
        if (a > 0)
            x++;
        if (b > 0)
            x++;
        if (c > 0)
            x++;
        if (a < 0)
            y++;
        if (b < 0)
            y++;
        if (c < 0)
            y++;
        System.out.println("В исходном наборе положительных чисел:" + x);
        System.out.println("В исходном наборе отрицательных чисел:" + y);
    }
}
