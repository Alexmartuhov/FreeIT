package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Почитать сумму четных элементов стоящих на главной диагонали.
public class DeepArray1 {
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
        int sum = 0;
        for (i = 0; i < mass.length; i++) {
            if (mass[i][i] % 2 == 0) {
                sum += mass[i][i];
            }
        }
        System.out.println("Сумма четных элементов на главной диагонали: "+sum);
    }
}
