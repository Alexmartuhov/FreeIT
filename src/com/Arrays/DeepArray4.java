package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
public class DeepArray4 {
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
        System.out.print("Cумма четных элементов стоящих над побочной диагональю: ");
        int sum = 0;
        for (i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i][j] % 2 == 0) {
                    sum += mass[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
