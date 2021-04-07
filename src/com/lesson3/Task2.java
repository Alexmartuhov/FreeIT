package com.lesson3;

//Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа
public class Task2 {
    public static void main(String[] args) {
        int sum = 1;
        for (int hour = 1; hour < 25; hour++) {
            if (hour % 3 == 0) {
                sum *= 2;
                System.out.println("Через " + hour + " часов(а) амёб будет: " + sum);
            }
        }
    }
}
