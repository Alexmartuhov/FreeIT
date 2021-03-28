package com.lesson2;
//        Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
//        Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
//        Требуется сравнить длину каждого отрезка-стороны с суммой двух других. Если хотя бы в одном
//        случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сторона а:");
        int a = sc.nextInt();
        System.out.print("Сторона b:");
        int b = sc.nextInt();
        System.out.print("Сторона c:");
        int c = sc.nextInt();
        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.print("Такой треугольник существует");
        }
        else {
            System.out.print("Такой треугольник не существует");
        }
    }
}
