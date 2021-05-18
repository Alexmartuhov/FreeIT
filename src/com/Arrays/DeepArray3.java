package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Проверить произведение элементов какой диагонали больше
public class DeepArray3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы:");
        int i = sc1.nextInt();
        int[][] mass = new int[i][i];
        for (i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = r.nextInt(51);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int product1 = 1, product2 = 1;
        for (i = 0; i < mass.length; i++) {
            product1*=mass[i][i];
            }
        for (i = mass.length-1; i >=0; i--) {
            product2*=mass[mass.length-1-i][i];
        }
        System.out.println();
        if (product1 == product2) {
            System.out.println("Произведения диагоналей равны");
        } else {
            if (product1 > product2) {
                System.out.println("Произведение главной диагонали больше");
            } else {
                System.out.println("Произведение главной диагонали меньше");
            }
        }
    }
}
