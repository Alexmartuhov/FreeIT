package com.Arrays;

//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.
public class Task1 {
    public static void main(String[] args) {
        int number = 20;
        int length = number / 2; //находим длину массива
        int[] mass = new int[length];
        mass[0] = 2;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 2 * (i + 1);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 2 * (i + 1);
            System.out.println(mass[i]);
        }
    }
}
