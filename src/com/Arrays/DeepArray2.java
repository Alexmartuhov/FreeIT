package com.Arrays;

import java.util.Random;
import java.util.Scanner;

//Вывести нечетные элементы находящиеся под главной
//диагональю(включительно).
public class DeepArray2 {
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
        System.out.println("Нечетные элементы массива ниже главной диагонали:");
        for (i = 0; i < mass.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (mass[i][j] % 2 != 0) {
                    System.out.print(mass[i][j] + " ");
                }
            }
        }
    }
}
