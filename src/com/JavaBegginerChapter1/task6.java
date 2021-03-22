package com.JavaBegginerChapter1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();

        if ((number<1000) && (number>99)){
            System.out.println("Число трехзначное");
            }
        else {
            System.out.println("Число не трехзначное");
        }
        if (number%10==7)
            System.out.println("Последняя цифра семерка");
        else
            System.out.println("Последняя цифра не семерка");
        if (number%2==0){
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }
}
