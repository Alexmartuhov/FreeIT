package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//переменную n. Если пользователь ввёл не подходящее число, то программа
//должна выдать соответствующее сообщение. Создать массив из n случайных
//целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//только из чётных элементов первого массива, если они там есть, и вывести его
//на экран.
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите число:");
        int massLength = sc.nextInt();
        if (massLength <= 3) {
            System.out.println("Вы ввели неверное значение");
        } else {
            int[] mass = new int[massLength];
            int massEvenLength = 0;
            for (int i = 0; i < massLength; i++) {
                mass[i] = r.nextInt(massLength + 1);
                System.out.print(mass[i]+" ");
                if (mass[i] != 0 && mass[i] % 2 == 0) {
                    massEvenLength++;  //находим количество четных элементов
                }
            }
            System.out.println();
            int[] massEven = new int[massEvenLength];  //создаем массив четных лементов
            int j = 0;
            for (int i = 0; i < massLength; i++) {
                if (mass[i] != 0 && mass[i] % 2 == 0) {     //заполняем массив четными значениями
                    massEven[j] = mass[i];
                    System.out.print(massEven[j]+" ");
                    j++;
                }
            }
        }
    }

}

