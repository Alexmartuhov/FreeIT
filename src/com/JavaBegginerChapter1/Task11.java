package com.JavaBegginerChapter1;

import java.util.Scanner;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое натуральное число:");
        int x = sc.nextInt();
        boolean prostoe = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                prostoe = false;
                break;
            }
        }
        if(x<=1) {
            prostoe = false;
        }
        if (!prostoe){
            System.out.print("Число не является простым");
        }
        if (prostoe) {
            System.out.print("Число является простым");
        }
    }
}

