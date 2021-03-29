package com.Arrays;
//2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 ... 7 5 3 1).
public class Task2 {
    public static void main(String[] args) {
        int first=1; //первый элемент
        int last = 99; //последнийй элемент
        int length=0;
        for(int i=first;i<=last;i+=2){
            length++; //находим длину массива
        }
        int[] mass = new int[length];
        for (int i = 0; i <length; i ++) {
            mass[i]=1+2*i;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = length-1; i >=0; i --) {
            System.out.print(mass[i] + " ");
        }
    }
}
