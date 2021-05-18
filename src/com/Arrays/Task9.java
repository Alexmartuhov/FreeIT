package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Пользователь должен указать с клавиатуры положительное число, а
//программа должна создать массив указанного размера из случайных целых
//чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//определить и сообщить пользователю о том, сумма какой половины массива
//больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то выдать соответствующее
//сообщение
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите число:");
        int massLength = sc.nextInt();
        if (massLength <= 0) {
            System.out.println("Вы ввели неверное значение");
        } else {
            int[] mass = new int[massLength];
            int leftSum = 0;
            int rightSum = 0;
            int halfMassLength = massLength / 2;
            for (int i = 0; i < massLength; i++) {
                mass[i] = r.nextInt(16);
                System.out.print(mass[i] + " ");
                if (i < halfMassLength) {
                    leftSum += mass[i];
                }
                if (i >= massLength - halfMassLength) {
                    rightSum += mass[i];
                }
            }
            System.out.println();
            if (rightSum == leftSum) {
                System.out.println("Суммы модулей левой и правой стороны массива равны");
            } else {
                if (rightSum > leftSum) {
                    System.out.println("Сумма правой стороны массива больше");
                } else {
                    System.out.println("Сумма левой стороны массива больше");
                }
            }

        }
    }
}
