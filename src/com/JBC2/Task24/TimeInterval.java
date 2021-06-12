package com.JBC2.Task24;

import java.sql.Time;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.
public class TimeInterval {
    private int hour;
    private int min;
    private int sec;

    TimeInterval(int sec) {      //конструтор получающий количество секунд
        this.sec = sec % 60;
        int min = (sec - this.sec) / 60;
        this.min = min % 60;
        hour = (min - this.min) / 60;
    }

    TimeInterval(int hour, int min, int sec) {   //конструтор, получающий данные по отдельности
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    int getSecond() {                                //метод для получения полного количества секунд
        return sec + min * 60 + hour * 60 * 60;
    }

    int compareInterval(TimeInterval compare) {        //метод для сравнения
        int time1 = getSecond();
        int time2 = compare.getSecond();
        int comp = 0;
        if (time1 > time2) return comp = 1;
        if (time1 < time2) return comp = -1;
        return comp;
    }

    void printTime() {     //метод для вывода на печать
        System.out.println(hour + " час(ов) " + min + " минут(ы) " + sec + " секунд(ы)");
        System.out.print("Общее количество секунд: " + (sec + min * 60 + hour * 60 * 60));
        System.out.println();
    }

    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(10500);
        TimeInterval interval2 = new TimeInterval(2, 50, 45);
        interval1.printTime();
        interval2.printTime();
        switch (interval1.compareInterval(interval2)) {   //вывод результата сравнения
            case 0:
                System.out.println("Интервалы равны");
                break;
            case 1:
                System.out.println("Первый интервал больше");
                break;
            case -1:
                System.out.println("Первый интервал меньше");
                break;
        }
    }
}
