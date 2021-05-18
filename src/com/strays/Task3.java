package com.strays;
//3)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое слово:");
        String s1 = sc.next();
        System.out.print("Второе слово:");
        String s2 = sc.next();
        System.out.print("Третье слово:");
        String s3 = sc.next();
        String str1, str2, str3;
        str1 = "";
        str2 = "";
        str3 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            str1 += s1.charAt(i);
        }
        for (int i = s2.length() - 1; i >= 0; i--) {
            str2 += s2.charAt(i);
        }
        for (int i = s3.length() - 1; i >= 0; i--) {
            str3 += s3.charAt(i);
        }
        if (s1.equalsIgnoreCase(str1)) {
            System.out.println(s1);
        }
        if (s2.equalsIgnoreCase(str2)) {
            System.out.println(s2);
        }
        if (s3.equalsIgnoreCase(str3)) {
            System.out.println(s3);
        }
    }
}
