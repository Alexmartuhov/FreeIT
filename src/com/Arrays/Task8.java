package com.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

//Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//массива должен равняться отношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три
//массива на экран (каждый на отдельной строке), затем вывести количество
//целых элементов в третьем массиве.
public class Task8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        double[] mass3 = new double[10];
        int integerArraysElements = 0;
        for (int i = 0; i < 10; i++) {
            mass1[i] = r.nextInt(10);
            mass2[i] = r.nextInt(10);
            if (mass2[i]==0){
                System.out.println("деление на ноль!");
                mass3[i]=-1;
                continue;
            }
            mass3[i] = (float) mass1[i] / (float)mass2[i];
            if (mass3[i] % 1 == 0) {
                integerArraysElements++;
            }
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        String str=Arrays.toString(mass3);
        str=str.replace("-1.0","exeption");
        System.out.println(str);
        System.out.println(integerArraysElements);
        }
}
