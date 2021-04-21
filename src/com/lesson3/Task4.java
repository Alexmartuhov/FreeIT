package com.lesson3;

import java.util.Scanner;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число:");
        int a = sc.nextInt();
        System.out.print("Второе число:");
        int b = sc.nextInt();
        int sum=0;
        if(b>=0) {
            while (b > 0) {
                sum += a;
                b--;
            }
        }
        if(b<0) {
            while (b < 0) {
                sum -= a;
                b++;
            }
        }
        System.out.print("Произведение: "+sum);
    }
}
