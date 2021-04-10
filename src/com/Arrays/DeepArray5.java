package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//строкой и т. д.)
public class DeepArray5 {
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
        System.out.println("Транспонированная матрица");
        int[][] mass2 = new int[i][i];
        for (i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass2[i][j]=mass[j][i];
                System.out.print(mass2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
