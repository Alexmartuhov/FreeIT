package com.JavaBegginerChapter1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число:");
        int x = sc.nextInt();
        if ((x / 1000 < 1) || (x / 1000 > 9))
            System.out.println("Число не четырехначное");
        else {
            int x1, x2, x3, x4;
            x1 = x % 10;
            x2 = x / 10 % 10;
            x3 = x / 100 % 10;
            x4 = x / 1000;
            boolean a = x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4;
            System.out.println("все цифры числа различны:" + a);
        }
    }
}
