package com.lesson3;

//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task5 {
    public static void main(String[] args) {
        double sant, inch = 2.54;
        for (int i = 1; i <= 20; i++) {
            sant = inch*i;
            System.out.print(i + " дюйм");
            if (i == 2 || i == 3 || i == 4) {
                System.out.print('а');
            }
            if (i>4) {
                System.out.print("ов");
            }
            System.out.println("="+sant +" сантиметра");
        }

    }
}
