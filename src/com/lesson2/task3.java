package com.lesson2;
// Дано целое число. Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10.
// Вывести полученное число

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Исходное число:");
        int a = sc.nextInt();
        if (a != 0) {
            if (a < 0) {
                a -= 2;
            } else {
                a += 1;
            }
        }
        else
            {
                a = 10;
            }
        System.out.print("Результат:"+a);
    }
}
