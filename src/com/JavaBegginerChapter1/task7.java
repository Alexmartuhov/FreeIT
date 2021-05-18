package com.JavaBegginerChapter1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сторона а:");
        int a = sc.nextInt();
        System.out.print("Сторона b:");
        int b = sc.nextInt();
        System.out.print("Радиус круга:");
        int r = sc.nextInt();
        double diag=a*a+b*b;
        if (diag<=4*r*r)
            System.out.print("Прямоугольное отверстие со сторонами "+a+" и "+b+" можно закрыть кругом с радиусом "+r);
        else
            System.out.print("Прямоугольное отверстие со сторонами "+a+" и "+b+" нельзя закрыть кругом с радиусом "+r);
    }
}