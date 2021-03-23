package com.lesson2;

import java.util.Scanner;

//В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество программистов:");
        int x = sc.nextInt();
        int ost100 = x % 100;
        int ost10 = x % 10;
        System.out.print(x);
        if ((ost100 < 20) && (ost100 > 10))
            System.out.println(" программистов");
        else {
            switch (ost10) {
                case 1:
                    System.out.println(" программист");
                    break;
                case 2:
                    System.out.println(" программиста");
                    break;
                case 3:
                    System.out.println(" программиста");
                    break;
                case 4:
                    System.out.println(" программиста");
                    break;
                default:
                    System.out.println(" программистов");
            }
        }
    }
}
