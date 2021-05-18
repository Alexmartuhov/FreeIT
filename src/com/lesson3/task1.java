package com.lesson3;
//Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?

public class task1 {
    public static void main(String[] args) {
        double dist = 0;
        double run = 10;
        for (int day = 1; day<8; day++) {
            dist = dist + run;
            run *= 1.1;
        }
        System.out.print("Суммарный путь "+dist+" км");
    }
}
