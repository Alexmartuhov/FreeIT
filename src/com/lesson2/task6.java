package com.lesson2;

import java.util.Scanner;

//Даны 2 числа. Вывести большее из них
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число:");
        int a = sc.nextInt();
        System.out.print("Второе число:");
        int b = sc.nextInt();
        if(a>b)
            System.out.print(a);
        else
            System.out.print(b);
    }
}
