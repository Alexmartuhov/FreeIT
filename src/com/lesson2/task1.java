package com.lesson2;
//        В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и
//        положительное оно или отрицательное. Например, "это однозначное положительное число".
//        Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        if ((a!=0)) {
            if (a < 0)
                System.out.print("Это отрицательное ");
            else
                System.out.print("Это положительное ");
        }
        else
            System.out.print("Это ноль");
        if(a!=0) {
            if ((a < 10) && (a > -10))
                System.out.print("однозначное число");
            else if ((a < 100) && (a > -100))
                System.out.print("двузначное число");
            else
                System.out.print("число имеет три или более знаков");
        }
    }
}
